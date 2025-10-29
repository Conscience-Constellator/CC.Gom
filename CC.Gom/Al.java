package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.By.Get_Q_By_Q;
import java.util.ArrayList;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import static java.lang.StrictMath.max;

public class Al<Vectr_Typ extends Get_Q_By_Q> implements Inbl<Vectr_Typ>
{
	public static final Clas_Rap Class=Init_StRt(Al.class
			,Clas_Rap.class
	);/*Dep ?done*/

	public Al(ArrayList<Inbl> List,Inbl In)
	{
		List.add(In);
		this.List=List;
	}
	public Al(Inbl In){this(new ArrayList<>(),In);}
	public Al(){}

	public ArrayList<Inbl> List;
	@Override public int Dim_Num()
	{
		int Num=0;
		for(Inbl In:List){Num=max(Num,In.Dim_Num());}

		return Num;
	}

	@Override public boolean In(Vectr_Typ B){return false;}
	@Override public boolean In(Bordr<Vectr_Typ> B){return false;}

	static{Init_Nd(Al.class);}
}
