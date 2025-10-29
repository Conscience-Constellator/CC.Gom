package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;

import CC.Math.Line;

public interface Mov_Vectr
{
	Clas_Rap Class=Ad_Reg_Task(Mov_Vectr.class);

	void Move(Vectr Vector,Line[] Dim_List,double[] Cordg) throws No_COrd_Xeptn;
}