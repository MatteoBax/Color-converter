using System;
using System.IO;
using System.Diagnostics;
class converter{
    static Process process = new Process();
    public static void Main(string[] args)
    {
	  string path = @"-jar " + System.AppContext.BaseDirectory + "\\converter.jar";
        process.StartInfo.UseShellExecute = false;
        process.StartInfo.FileName = "java";
	  process.StartInfo.Arguments = path;
        process.StartInfo.CreateNoWindow = false;
        process.Start();
        
    }
}