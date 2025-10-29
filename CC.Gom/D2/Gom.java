package CC.Encycloped.Abs.Scal.Gom.D2;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Met.Nom_Imp_Par;
import CC.Encycloped.Concept.Concept_Abs.Concept;
import java.lang.reflect.Method;

public interface Gom extends CC.Encycloped.Abs.Scal.Gom.Gom
{
	Clas_Rap Class=Ad_Reg_Task(CC.Encycloped.Abs.Scal.Gom.D2.Gom.class);

	Concept Rot=new Concept("Rot"),Sher=new Concept("Sher");

	Method Turn();
	Method Rot();
	Nom_Imp_Par Ang_Bord();
}