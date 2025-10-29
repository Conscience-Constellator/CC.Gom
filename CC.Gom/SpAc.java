package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Syc.SNs.Sit.Cam;
import CC.Encycloped.Abs.Org.Syc.SNs.Sit.Draw_Object;
import CC.Encycloped.Abs.Scal.Physc.Phys_Com;
import CC.Encycloped.Abs.Scal.Physc.Phys_Ke_Havr;
import CC.Encycloped.Abs.Scal.Physc.Physic;
import CC.Util.By.Get_Q_By_Q;
import CC.Util.Tikbl;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import static java.lang.System.out;
import java.util.*;
import java.util.Map;

public class SpAc<Vectr_Typ extends Get_Q_By_Q> implements Phys_Ke_Havr<List<Phys_Com<Vectr_Typ>>>,Tikbl
{
	public static final Clas_Rap Class=Init_StRt(SpAc.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public SpAc(ArrayList<Inbl<Vectr_Typ>> Spac_Objectg)
	{
		Set_Objectg(Spac_Objectg);
		Physicg_=new HashMap<>();
		Tik_Taskg=new HashMap<>();
		Tik_Al("Sees");
		Tik_Al("Tik_Tran");
	}
	public SpAc(Inbl<Vectr_Typ>... Objectg){this(new ArrayList<>(Arrays.asList(Objectg)));}
	public SpAc(){this(new ArrayList<>());}

	public Map<String,Physic> Physicg;
	public Map<String,List<Phys_Com<Vectr_Typ>>> Physicg_;
		@Override
		public List<Phys_Com<Vectr_Typ>> Get_Phys(String Nam)
		{
			if(!Physicg_.containsKey(Nam))
			{
				List<Phys_Com<Vectr_Typ>> List=new ArrayList<>();
				Physicg_.put(Nam,(List<Phys_Com<Vectr_Typ>>)List);

				return List;
			}
			else return Physicg_.get(Nam);
		}
		public void Ad_Phys_Com(Phys_Com<Vectr_Typ> Com){Get_Phys(Com.Get_Phys_Nam()).add(Com);}
	public List<Inbl<Vectr_Typ>> Objectg;
		public void Set_Objectg(List<Inbl<Vectr_Typ>> List)
		{
			Objectg=List;
			Drawg=new ArrayList<>();
		}
		public void Ad_Object(SpAc_Object<Vectr_Typ> Object){Object.Ad_To_Spac(this);}
			public void Ad_Objectg(SpAc_Object<Vectr_Typ>... Objectg){for(SpAc_Object<Vectr_Typ> Object:Objectg){Ad_Object(Object);}}
	public Map<String,Tikbl> Tik_Taskg;
	public ArrayList<Draw_Object<Vectr_Typ>> Drawg;
		public void Ad_AbsNt_Draw(Draw_Object<Vectr_Typ> Object){if(!Drawg.contains(Object)){Drawg.add(Object);}}
	public void Draw(Cam<Vectr_Typ> Cam)
	{
		out.println("Draw Spac:"+Drawg.size());
		for(Draw_Object<Vectr_Typ> Object:Drawg)
		{
//			out.println("Draw");
			Object.Draw(Cam);
		}
	}

	public void Tik_Phys_LMNt(String Nam)
	{
		for(Phys_Com<Vectr_Typ> Com:Get_Phys(Nam))
		{
//			if(){out.println(":");

			((Tikbl)Com).Tik();
		}
	}
	public void Tik_Al(String Nam){Tik_Taskg.put(Nam,()->{Tik_Phys_LMNt(Nam);});}
	@Override
	public void Tik()
	{
		for(String Task:Tik_Taskg.keySet())
		{
			if(true){out.println("Task:"+Task);}

			Tik_Taskg.get(Task).run();
		}
	}

	static{Init_Nd(SpAc.class);}
}