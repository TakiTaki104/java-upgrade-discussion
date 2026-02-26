import java.lang.classfile.ClassFile;
import java.lang.classfile.ClassModel;

class Sample {
    public static void main(String[] args) throws Exception {
        byte[] bytes = Sample.class.getResourceAsStream("/Sample.class").readAllBytes();
        ClassModel model = ClassFile.of().parse(bytes);
        System.out.println(model.thisClass().asInternalName());
    }
}
