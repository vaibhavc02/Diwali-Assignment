using System;
using System.Collections.Generic;

namespace StudentManagementAPI.Models;

public static class StudentData
{
    public static List<Student> Students = new List<Student>
    {
        new Student { Id = 1, Name = "Alice", BirthDate = new DateTime(2005, 5, 10), Address = "Mumbai", SchoolName = "XYZ School", Marks = 85 },
        new Student { Id = 2, Name = "Bob", BirthDate = new DateTime(2006, 3, 15), Address = "Pune", SchoolName = "ABC School", Marks = 72 },
        new Student { Id = 3, Name = "Charlie", BirthDate = new DateTime(2005, 11, 20), Address = "Nagpur", SchoolName = "LMN School", Marks = 90 }
    };
}
