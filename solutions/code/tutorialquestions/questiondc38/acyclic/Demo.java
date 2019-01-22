package tutorialquestions.questiondc38.acyclic;

public class Demo {

  public static void main(String[] args) {

    GroupEmailAddress multicoreProgrammingGroup = new GroupEmailAddress("multicore@doc.ic.ac.uk");

    multicoreProgrammingGroup.addEmailAddress(new IndividualEmailAddress("afd@doc.ic.ac.uk"));
    multicoreProgrammingGroup.addEmailAddress(new IndividualEmailAddress("abetts@doc.ic.ac.uk"));
    multicoreProgrammingGroup.addEmailAddress(new IndividualEmailAddress("pt1110@doc.ic.ac.uk"));

    GroupEmailAddress softwarePerformanceOptimizationGroup = new GroupEmailAddress(
        "spo@doc.ic.ac.uk");
    softwarePerformanceOptimizationGroup
        .addEmailAddress(new IndividualEmailAddress("phjk@doc.ic.ac.uk"));
    softwarePerformanceOptimizationGroup
        .addEmailAddress(new IndividualEmailAddress("abetts@doc.ic.ac.uk"));
    softwarePerformanceOptimizationGroup
        .addEmailAddress(new IndividualEmailAddress("nchong@doc.ic.ac.uk"));

    IndividualEmailAddress wayne = new IndividualEmailAddress("wayne@doc.ic.ac.uk");

    GroupEmailAddress computerSystemsGroup = new GroupEmailAddress("cosys@doc.ic.ac.uk");
    computerSystemsGroup.addEmailAddress(wayne);
    computerSystemsGroup.addEmailAddress(multicoreProgrammingGroup);
    computerSystemsGroup.addEmailAddress(softwarePerformanceOptimizationGroup);

    System.out.println("All members of Computer Systems group: "
        + computerSystemsGroup.getTargets());

    System.out.println("All members of Multicore Programming group: "
        + multicoreProgrammingGroup.getTargets());

    System.out.println("All members of SPO group: "
        + softwarePerformanceOptimizationGroup.getTargets());

    System.out.println("An email to Wayne should simply go to "
        + wayne.getTargets());

  }

}
