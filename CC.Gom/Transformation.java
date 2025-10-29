package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.By.Get_Q_By_Q;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;

public interface Transformation<Vectr_Typ extends Get_Q_By_Q>
{
	Clas_Rap Class=Ad_Reg_Task(Transformation.class);

	double[] Transform(Vectr_Typ Transformed,Vectr_Typ Parameter);
}