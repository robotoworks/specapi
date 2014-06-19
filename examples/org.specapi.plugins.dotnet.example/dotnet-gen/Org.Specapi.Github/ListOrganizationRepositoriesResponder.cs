using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class ListOrganizationRepositoriesResponder
    {
        public delegate void Status200Handler(Repository[] result);
        public delegate void StatusUnexpectedHandler(HttpWebResponse result);
        public Status200Handler On200 { get; set; }
        public StatusUnexpectedHandler OnOther { get; set; }
    }
}
