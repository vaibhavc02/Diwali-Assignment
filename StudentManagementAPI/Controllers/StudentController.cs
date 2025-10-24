using Microsoft.AspNetCore.Mvc;
using StudentManagementAPI.Models;
using System.Linq;

[ApiController]
[Route("api/[controller]")]
public class StudentsController : ControllerBase
{
    [HttpGet]
    public IActionResult GetAllStudents()
    {
        return Ok(StudentData.Students);
    }

    [HttpGet("{id}")]
    public IActionResult GetStudentById(int id)
    {
        var student = StudentData.Students.FirstOrDefault(s => s.Id == id);
        if (student == null)
            return NotFound($"Student with Id = {id} not found.");
        return Ok(student);
    }

    [HttpGet("marks")]
    public IActionResult GetStudentsByMarksRange([FromQuery] double min, [FromQuery] double max)
    {
        var studentsInRange = StudentData.Students.Where(s => s.Marks >= min && s.Marks <= max).ToList();
        return Ok(studentsInRange);
    }
}
