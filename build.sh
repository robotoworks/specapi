#!/bin/bash

WORKING_DIR=$PWD
VERSION=0.1.3
TARGET=target
SITE_PATH=$WORKING_DIR/target/ide/eclipse
BIN_PATH=$WORKING_DIR/target/bin
BIN_PATH_PLUGINS=$WORKING_DIR/target/bin/plugins
DIST_PATH=$WORKING_DIR/dist

rm -r $DIST_PATH
rm -r $TARGET
mkdir $TARGET

buildSpecApi() {
	echo "Building SpecApi..."
	mvn clean install
	
	mkdir -p $SITE_PATH
	cp -r $WORKING_DIR/releng/org.specapi.updatesite/target/repository/** $SITE_PATH
	
	mkdir -p $BIN_PATH
	cp -r $WORKING_DIR/plugins/org.specapi.standalone/target/appassembler/bin/libs $BIN_PATH/libs
    cp $WORKING_DIR/plugins/org.specapi.standalone/target/appassembler/bin/specapi $BIN_PATH/specapi
    cp $WORKING_DIR/plugins/org.specapi.standalone/target/appassembler/bin/specapi.bat $BIN_PATH/specapi.bat
 	
 	chmod u+x $BIN_PATH/specapi
 
    #Copy SpecAPI Standalone Plugins
    mkdir -p $BIN_PATH_PLUGINS
    cp $WORKING_DIR/plugins/org.specapi.plugins.simple/target/org.specapi.plugins.simple-$VERSION-SNAPSHOT.jar $BIN_PATH_PLUGINS/org.specapi.plugins.simple.jar
    cp $WORKING_DIR/plugins/org.specapi.plugins.docs/target/org.specapi.plugins.docs-$VERSION-SNAPSHOT.jar $BIN_PATH_PLUGINS/org.specapi.plugins.docs.jar
    cp $WORKING_DIR/plugins/org.specapi.plugins.swagger/target/org.specapi.plugins.swagger-$VERSION-SNAPSHOT.jar $BIN_PATH_PLUGINS/org.specapi.plugins.swagger.jar
    cp $WORKING_DIR/plugins/org.specapi.plugins.jquery/target/org.specapi.plugins.jquery-$VERSION-SNAPSHOT.jar $BIN_PATH_PLUGINS/org.specapi.plugins.jquery.jar

    echo "Packaging new distribution"
    mkdir -p $DIST_PATH
	tar czf $DIST_PATH/specapi.tar.gz target
	openssl sha1 $DIST_PATH/specapi.tar.gz 

}

build() {
    buildSpecApi
}

build




