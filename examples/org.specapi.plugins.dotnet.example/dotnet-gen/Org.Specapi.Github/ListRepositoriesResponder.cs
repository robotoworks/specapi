using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class ListRepositoriesResponder
    {
        public delegate void Status200Handler(Repository[] result);
        public delegate void Status401Handler(ErrorMessage result);
        public delegate void StatusUnexpectedHandler(HttpWebResponse result);
        public Status200Handler On200 { get; set; }
        public Status401Handler On401 { get; set; }
        public StatusUnexpectedHandler OnOther { get; set; }
    }
}
