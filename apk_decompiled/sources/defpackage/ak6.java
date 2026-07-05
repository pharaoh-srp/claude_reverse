package defpackage;

import android.os.Bundle;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class ak6 {
    public static final long[] f = new long[0];
    public final /* synthetic */ int a = 2;
    public long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ak6(SerialDescriptor serialDescriptor, ot7 ot7Var) {
        serialDescriptor.getClass();
        this.c = serialDescriptor;
        this.d = ot7Var;
        int iE = serialDescriptor.e();
        if (iE <= 64) {
            this.b = iE != 64 ? (-1) << iE : 0L;
            this.e = f;
            return;
        }
        this.b = 0L;
        int i = (iE - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iE & 63) != 0) {
            jArr[i - 1] = (-1) << iE;
        }
        this.e = jArr;
    }

    public static ak6 b(rvj rvjVar) {
        String str = rvjVar.E;
        String str2 = rvjVar.G;
        return new ak6(rvjVar.H, rvjVar.F.x0(), str, str2);
    }

    public int a(g4e g4eVar, long j) {
        TimeZone timeZone = blj.a;
        ArrayList arrayList = g4eVar.q;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + g4eVar.c.a.h + " was leaked. Did you forget to close a response body?";
                s4d s4dVar = s4d.a;
                s4d.a.j(str, ((d4e) reference).a);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    g4eVar.r = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public rvj c() {
        return new rvj((String) this.c, new avj(new Bundle((Bundle) this.e)), (String) this.d, this.b);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                String str = (String) this.d;
                String str2 = (String) this.c;
                String strValueOf = String.valueOf((Bundle) this.e);
                StringBuilder sbR = kgh.r("origin=", str, ",name=", str2, ",params=");
                sbR.append(strValueOf);
                return sbR.toString();
            default:
                return super.toString();
        }
    }

    public ak6(long j, Bundle bundle, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.e = bundle;
        this.b = j;
    }

    public ak6(q7h q7hVar) {
        q7hVar.getClass();
        TimeUnit.MINUTES.getClass();
        this.b = 300000000000L;
        this.c = q7hVar.d();
        this.d = new h4e(this, ij0.m(new StringBuilder(), blj.b, " ConnectionPool connection closer"));
        this.e = new ConcurrentLinkedQueue();
    }
}
