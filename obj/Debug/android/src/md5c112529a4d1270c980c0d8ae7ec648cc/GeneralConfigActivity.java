package md5c112529a4d1270c980c0d8ae7ec648cc;


public class GeneralConfigActivity
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("DMSvStandard.GeneralConfigActivity, DMSvStandard, Version=2.5.8.0, Culture=neutral, PublicKeyToken=null", GeneralConfigActivity.class, __md_methods);
	}


	public GeneralConfigActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == GeneralConfigActivity.class)
			mono.android.TypeManager.Activate ("DMSvStandard.GeneralConfigActivity, DMSvStandard, Version=2.5.8.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}