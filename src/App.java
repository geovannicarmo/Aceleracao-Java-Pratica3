public class App {
    public static void main(String[] args) throws Exception {

        Students novoEstudante = new Students();

        novoEstudante.setEmail("ex@email.com");
        novoEstudante.setName("exName");

        novoEstudante.dataSchool.setCourse("exCurso");
        novoEstudante.dataSchool.setCollegeName("exFaculdade");

        Matter novaMateria = new Matter();

        novaMateria.setTeacher("exProfessor");
        novaMateria.setExercises("exFaculdade");



        System.out.println( novoEstudante.getEmail());
        System.out.println( novoEstudante.getName());

        System.out.println( novoEstudante.dataSchool.getCollegeName());

        System.out.println( novaMateria.getTeacher());
    }
}
