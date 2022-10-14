using System;
using System.IO;
using System.Diagnostics;
using System.Runtime.InteropServices;
class converter{
    [DllImport("kernel32.dll")]
    static extern IntPtr GetConsoleWindow();
    [DllImport("user32.dll")]
    static extern bool ShowWindow(IntPtr hWnd, int nCmdShow);
    const int SW_HIDE = 0;
    static Process process = new Process();
    public static void Main(string[] args)
    {
	  var handle = GetConsoleWindow();
        //Hide
        ShowWindow(handle, SW_HIDE);
	  string path = @"-jar " + System.AppContext.BaseDirectory + "\\converter.jar";
        process.StartInfo.UseShellExecute = false;
        process.StartInfo.FileName = "java";
	  process.StartInfo.Arguments = path;
        process.StartInfo.CreateNoWindow = false;
        process.Start();
        
    }
}