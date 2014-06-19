using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class CreateRepositoryResponder
    {
        public delegate void Status200Handler(Repository result);
        public delegate void Status400Handler(ErrorMessage result);
        public delegate void Status401Handler(ErrorMessage result);
        public delegate void Status422Handler(ErrorMessage result);
        public delegate void StatusUnexpectedHandler(HttpWebResponse result);
        public Status200Handler On200 { get; set; }
        public Status400Handler On400 { get; set; }
        public Status401Handler On401 { get; set; }
        public Status422Handler On422 { get; set; }
        public StatusUnexpectedHandler OnOther { get; set; }
    }
}
