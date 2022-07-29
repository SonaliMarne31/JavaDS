package Implement;

public class PersonHasAJob {
     //composition has-a relationship
     private JobComposition job;
   
     public PersonHasAJob() {
         this.job = new JobComposition();
         job.setSalary(1000L);
     }
     public long getSalary() {
         return job.getSalary();
     }
}
