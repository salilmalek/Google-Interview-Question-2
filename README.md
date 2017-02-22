# Google-Interview-Question-2

I recently go throught Google's Interview. This is one of Interview Question.

I copied this question' TEXT from "https://geraldo1993.github.io/blog/Google-Interview-Q3/". But just the Question's Text because I forgot how they asked in interview but I am sure that they asked this same one. I was not able to solved it in interview but I solved ot on same day.

------------------------------------------------------------------------------------------------------------------------------------

You are given a listing of directories and files in a file system.Each directory and file has a name, which is a non-empty string consisting of alphanumerical characters.Additionally, the name of each file contains a single dot character; the part of the name starting with the dot is called extension. Directory names dot not contain any dots.All the names are case-sensitive.

Each entry is listed on a separate line. Every directory is followed by the listing of its contents indented by one space character. The contents of the root directory are not indented.

Here is a sample listing:

dir1
 dir11
 dir12
  picture.jpeg
  dir121
  file1.txt
dir2
 file2.gif



we have three files(picture.jpeg, file.txt and file2.gif) and six directories(dir1, dir11, dir12, dir121, dir2 and the root directory ). Directory 12 contains two files(picture.jpeg and file1.txt)and an empty directory(dir121). The root directory contains two directories(dir1 and dir2).

The absolute path of a directory is a string containing the names of directories which have to be traversed(from the root directory)to reach the directory, separated by slash characters.For example, the absolute path to the directory dir121 is “/dir1/dir12/dir121”. Note that there is no”drive letter”,such as “C:”, and each absolute path starts with a slash.The absolute oath of a root is “/”/

We are only interested in directories containing image files; that is, files with extension .jpeg, .png, or .gif(and only these extensions).We are looking for the longest absolute path leading to some directory containing (directly or indirectly)an image file.For example, in file system described above there are four directories(dir12, dir1, dir2 and the root directory)containing image files, and the longest path to such a directory is “/dir1/dir12”, which is 11 characters long.

write a function:

def solution(S) that, given a string S consisting of N characters which contains the listing of a file system, returns the maximum length(in characters) of an absolute path to some directory containing an image file.For example, given the sample listing shown above, the function should return 11, as explained above. If there are no image files in the listing, the function should return 0.
Assume that:

N is an integer within the range [1..3,000,000];
string S consist only of alphanumerical characters(a-z and / or A-Z and/ or 0-9,), spaces, dots(.)and end-of-line characters;
string S is a correct listing of a file system contents.
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N)(not counting the storage required for input arguments).
