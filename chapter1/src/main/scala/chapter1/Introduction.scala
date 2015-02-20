package chapter1

/**
 * Created by sweaterr on 15. 2. 19..
 */
object Introduction extends App {

  def isPalindrome(word: String) = {
    val modifiedWord = word.toLowerCase.replaceAll("[^a-z0-9]", "")
    val reversed = modifiedWord.reverse
    modifiedWord == reversed
  }
  println("Is 'Herculaneum' a palindrome? " + isPalindrome("Herculaneum"))
  println("Is '이효리' a palindrome? " + isPalindrome("이효리"))
}