package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k8i {
    public final Context a;
    public final u0h b = new u0h(new p3f(19, this));
    public final Object c = new Object();
    public String d;
    public boolean e;

    public k8i(Context context) {
        this.a = context;
    }

    public static final SharedPreferences b(k8i k8iVar, Context context, Exception exc) {
        Object hreVar;
        Object hreVar2;
        zfa.a.getClass();
        boolean zB = yfa.b();
        sfa sfaVar = sfa.WARN;
        if (zB) {
            String strE = iuj.E(k8iVar);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                String strQ = sq6.q(zfa.a, exc, "Encrypted prefs corrupted, recreating: ");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, strE, strQ);
                }
            }
        }
        context.deleteSharedPreferences("trusted_device");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry("_androidx_security_master_key_");
            hreVar = iei.a;
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        Throwable thA = jre.a(hreVar);
        if (thA != null) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE2 = iuj.E(k8iVar);
                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList2) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList2.add(obj2);
                }
                if (!arrayList2.isEmpty()) {
                    String strS = sq6.s(zfa.a, thA, "Failed to delete old keystore entry: ");
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((n30) ((zfa) it2.next())).b(sfaVar, strE2, strS);
                    }
                }
            }
        }
        try {
            hreVar2 = jn6.a(context, gva.a(gva.a));
        } catch (Throwable th2) {
            hreVar2 = new hre(th2);
        }
        Throwable thA2 = jre.a(hreVar2);
        if (thA2 != null) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE3 = iuj.E(k8iVar);
                CopyOnWriteArrayList copyOnWriteArrayList3 = yfa.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList3) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList3.add(obj3);
                }
                if (!arrayList3.isEmpty()) {
                    String strS2 = sq6.s(zfa.a, thA2, "Encrypted prefs recovery failed, token storage disabled: ");
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        ((n30) ((zfa) it3.next())).b(sfa.ERROR, strE3, strS2);
                    }
                }
            }
        }
        return (SharedPreferences) (hreVar2 instanceof hre ? null : hreVar2);
    }

    public final void a() {
        synchronized (this.c) {
            this.d = null;
            this.e = true;
            SharedPreferences sharedPreferencesD = d();
            if (sharedPreferencesD != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
                editorEdit.clear();
                editorEdit.apply();
            }
        }
    }

    public final String c() {
        SharedPreferences sharedPreferencesD = d();
        if (sharedPreferencesD != null) {
            return sharedPreferencesD.getString("device_id", null);
        }
        return null;
    }

    public final SharedPreferences d() {
        return (SharedPreferences) this.b.getValue();
    }

    public final String e() {
        SharedPreferences sharedPreferencesD = d();
        if (sharedPreferencesD != null) {
            return sharedPreferencesD.getString("reattest_kid", null);
        }
        return null;
    }

    public final String f() {
        String str;
        synchronized (this.c) {
            try {
                if (!this.e) {
                    SharedPreferences sharedPreferencesD = d();
                    this.d = sharedPreferencesD != null ? sharedPreferencesD.getString("token", null) : null;
                    this.e = true;
                }
                str = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void g(int i) {
        SharedPreferences sharedPreferencesD = d();
        if (sharedPreferencesD != null) {
            SharedPreferences.Editor editorEdit = sharedPreferencesD.edit();
            editorEdit.putInt("heal_enroll_attempts", i);
            editorEdit.apply();
        }
    }
}
