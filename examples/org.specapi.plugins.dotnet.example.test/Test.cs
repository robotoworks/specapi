using NUnit.Framework;
using System;
using Org.Specapi.Github;
using System.Net;
using System.Collections.Specialized;
using System.Linq;
using System.Runtime.Serialization.Json;

namespace org.specapi.plugins.dotnet.example.test
{
	[TestFixture ()]
	public class Test
	{
		[Test ()]
		public void ListUserRepositoriesTest ()
		{
			var api = new GithubAPI ();

			api.ListUserRepositories (
				new ListUserRepositoriesRequest("fluxtah") { 
					Sort = "full_name", 
					Direction = "asc",

					On200 = (repositories) => {
						// TODO: Handle a 200 response
					},
					OnOther = (response) => {
						// TODO: Handle any other response
					}
				});

		}

		[Test ()]
		public void ListRepositoriesTest ()
		{
			var api = new GithubAPI ();

			api.ListRepositories (new ListRepositoriesRequest { 
				Sort = "full_name", 
				Direction = "asc",

				On200 = (repositories) => {


				},
				On401 = (error) =>  {

				},
				OnOther = (response) => {
					// TODO: handle any other response that
					// is otherwise not handled by this responder
					// or not handled by the user
				}
			});

		}
	}
}

