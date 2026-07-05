package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ttk implements SharedPreferences.OnSharedPreferenceChangeListener {
    public /* synthetic */ jsk a;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        jsk jskVar = this.a;
        jskVar.getClass();
        if ("IABTCF_TCString".equals(str)) {
            jskVar.b0().R.b("IABTCF_TCString change picked up in listener.");
            uuk uukVar = jskVar.Y;
            dgj.v(uukVar);
            uukVar.b(500L);
        }
    }
}
