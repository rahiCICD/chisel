object VulnerableCode {
  def main(args: Array[String]): Unit = {
    val password = "mysecretpassword"
    println(s"The password is: $password")
    
    // Critical vulnerability: Writing password to a log file
    import java.io.PrintWriter
    val writer = new PrintWriter("log.txt")
    writer.println(s"Password: $password")
    writer.close()
  }
}
