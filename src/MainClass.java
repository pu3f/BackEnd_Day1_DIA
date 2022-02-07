import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<DigiJobs> digiJobs = new ArrayList<>();
        ArrayList<JobPosition> digiPosition = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int jobId, jobPositionId;
        String jobAddress, jobPositionName;

        DigiJobs jobs;
        JobPosition position;

        while (true) {
            //menu view
            System.out.println("\n ======DIGIJOBS======");
            System.out.println("1. Add new job");
            System.out.println("2. Print all jobs");
            System.out.println("3. Delete job");
            System.out.println("4. Exit");
            System.out.print("Choose 1-4 = ");
            String input = sc.next();

            //exit
            if (input.equalsIgnoreCase("4")) {
                return;

            //add new job
            } else if (input.equalsIgnoreCase("1")) {
                do {
                    System.out.print("Please input Job Id: ");
                    jobId = sc.nextInt();
                }while(jobId<0 || jobId>11);
                do {
                    System.out.print("Please input Job Address: ");
                    jobAddress = sc.next();
                }while (jobAddress.length()<5);
                do {
                    System.out.print("Please input Position Id: ");
                    jobPositionId = sc.nextInt();
                }while(jobPositionId<0 || jobPositionId>11);
                do {
                    System.out.print("Please input Position Name: ");
                    jobPositionName = sc.next();
                    System.out.println("Success add new job");
                }while (jobPositionName.length()<5);

                jobs = new DigiJobs(jobId, jobAddress);
                digiJobs.add(jobs);

                position = new JobPosition(jobPositionId, jobPositionName);
                digiPosition.add(position);

            //view current job
            } else if (input.equalsIgnoreCase("2")) {
                System.out.println("Your current job : ");
                for (DigiJobs viewJob : digiJobs){
                    for (JobPosition viewPosition : digiPosition) {
                        System.out.println(viewJob.getJobId()+","+viewJob.getJobAddress()+","+viewPosition.getPositionId()+","+viewPosition.getPositionName());
                    }
                }

            //delete job
            } else if (input.equalsIgnoreCase("3")) {
                int index = 0, flag = 0;
                System.out.print("Insert Id to remove : ");
                jobId = sc.nextInt();sc.nextLine();
                for (DigiJobs job: digiJobs) {
                    if (job.getJobId() == jobId) {
                        flag=1;
                        System.out.println("Success remove job");
                        digiJobs.remove(index);
                        break;
                    }
                    index++;
                }
                if (flag == 0) {
                    System.err.println("Job not found!");
                    sc.nextLine();
                }

            }
        }

    }

}
