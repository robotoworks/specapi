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
		public void TestCase ()
		{
			var api = new GithubAPI ();

			api.ListUserRepositories (
				new ListUserRepositoriesRequest("fluxtah") { 
					Sort = "full_name", 
					Direction = "asc" 
				},
				new ListUserRepositoriesResponder 
				{
					On200 = (repositories) => {
						// TODO: handle 200 response

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

