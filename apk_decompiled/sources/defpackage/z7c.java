package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class z7c {
    public final CharSequence a;
    public final long b;
    public final uzc c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public z7c(CharSequence charSequence, long j, uzc uzcVar) {
        this.a = charSequence;
        this.b = j;
        this.c = uzcVar;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            z7c z7cVar = (z7c) arrayList.get(i);
            uzc uzcVar = z7cVar.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = z7cVar.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", z7cVar.b);
            if (uzcVar != null) {
                bundle.putCharSequence("sender", uzcVar.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", y7c.a(ke0.q(uzcVar)));
                } else {
                    bundle.putBundle("person", uzcVar.b());
                }
            }
            String str = z7cVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = z7cVar.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = z7cVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public static ArrayList b(Parcelable[] parcelableArr) {
        uzc uzcVarC;
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                z7c z7cVar = null;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            uzcVarC = uzc.a(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            uzcVarC = ke0.c(v5.d(bundle.getParcelable("sender_person")));
                        } else if (bundle.containsKey("sender")) {
                            CharSequence charSequence = bundle.getCharSequence("sender");
                            uzc uzcVar = new uzc();
                            uzcVar.a = charSequence;
                            uzcVar.b = null;
                            uzcVar.c = null;
                            uzcVar.d = null;
                            uzcVar.e = false;
                            uzcVar.f = false;
                            uzcVarC = uzcVar;
                        } else {
                            uzcVarC = null;
                        }
                        z7c z7cVar2 = new z7c(bundle.getCharSequence("text"), bundle.getLong("time"), uzcVarC);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            z7cVar2.e = string;
                            z7cVar2.f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            z7cVar2.d.putAll(bundle.getBundle("extras"));
                        }
                        z7cVar = z7cVar2;
                    }
                } catch (ClassCastException unused) {
                }
                if (z7cVar != null) {
                    arrayList.add(z7cVar);
                }
            }
        }
        return arrayList;
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message messageA;
        int i = Build.VERSION.SDK_INT;
        long j = this.b;
        uzc uzcVar = this.c;
        CharSequence charSequence = this.a;
        if (i >= 28) {
            messageA = y7c.b(charSequence, j, uzcVar != null ? ke0.q(uzcVar) : null);
        } else {
            messageA = x7c.a(charSequence, j, uzcVar != null ? uzcVar.a : null);
        }
        String str = this.e;
        if (str != null) {
            x7c.b(messageA, str, this.f);
        }
        return messageA;
    }
}
