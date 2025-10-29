package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.By.Get_Q_By_Q;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;

public interface Vectrg_Havr<Vectr_Typ extends Get_Q_By_Q> extends Dim_Num_Havr,Vectr_Typ_Havr<Vectr_Typ>
{
	Clas_Rap Class=Ad_Reg_Task(Vectrg_Havr.class);

	Vectr_Typ Vectr(int Num);
	int Vectr_Num();
}