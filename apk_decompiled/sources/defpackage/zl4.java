package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.SystemClock;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import javax.crypto.Cipher;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public class zl4 implements sac, qo6, yd7, mf8, iqa, bxg {
    public final /* synthetic */ int E;

    public zl4(SideSheetBehavior sideSheetBehavior) {
        this.E = 18;
    }

    public static final String g(ByteString byteString, ByteString[] byteStringArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ByteString byteString2 = zvd.b;
        int iE = byteString.e();
        int i5 = 0;
        while (i5 < iE) {
            int i6 = (i5 + iE) / 2;
            while (i6 > -1 && byteString.j(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (byteString.j(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bJ = byteStringArr[i10].j(i11);
                    byte[] bArr = zkj.a;
                    int i13 = bJ & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bJ2 = byteString.j(i7 + i12);
                byte[] bArr2 = zkj.a;
                i4 = i3 - (bJ2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (byteStringArr[i10].e() != i11) {
                    z2 = z;
                } else {
                    if (i10 == byteStringArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iE2 = byteStringArr[i10].e() - i11;
                    int length = byteStringArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iE2 += byteStringArr[i15].e();
                    }
                    if (iE2 >= i14) {
                        if (iE2 <= i14) {
                            return byteString.p(i7, i9 + i7).o(dj2.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iE = i6;
        }
        return null;
    }

    private final void k() {
    }

    public static dk6 l(String str) {
        Object next;
        Iterator<E> it = dk6.J.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((dk6) next).E.equals(str)) {
                break;
            }
        }
        return (dk6) next;
    }

    public static i15 o(String str) {
        return new i15(str, null, 4, true);
    }

    private final void p(vef vefVar) {
    }

    @Override // defpackage.bxg
    public boolean a(jw7 jw7Var) {
        return false;
    }

    @Override // defpackage.mf8
    public boolean b() {
        boolean z;
        synchronized (di7.a) {
            try {
                int i = di7.c;
                di7.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > di7.d + 30000) {
                    di7.c = 0;
                    di7.d = SystemClock.uptimeMillis();
                    String[] list = di7.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    di7.e = list.length < 800;
                }
                z = di7.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.bxg
    public dxg c(jw7 jw7Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.mf8
    public boolean d(j8g j8gVar) {
        v46 v46Var = j8gVar.a;
        if ((v46Var instanceof q46 ? ((q46) v46Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        v46 v46Var2 = j8gVar.b;
        return (v46Var2 instanceof q46 ? ((q46) v46Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.bxg
    public int e(jw7 jw7Var) {
        return 1;
    }

    @Override // defpackage.qo6
    public Object f(String str, Provider provider) {
        switch (this.E) {
            case 5:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    public bbi h(u9i u9iVar, List list) {
        u9iVar.getClass();
        list.getClass();
        List parameters = u9iVar.getParameters();
        parameters.getClass();
        qai qaiVar = (qai) w44.V0(parameters);
        if (qaiVar != null) {
            int i = 1;
            if (qaiVar.U()) {
                List parameters2 = u9iVar.getParameters();
                parameters2.getClass();
                List list2 = parameters2;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((qai) it.next()).p());
                }
                return new tkg(i, sta.p0(w44.v1(arrayList, list)));
            }
        }
        return new a19((qai[]) parameters.toArray(new qai[0]), (vai[]) list.toArray(new vai[0]), false);
    }

    @Override // defpackage.iqa
    public Object i(n2d n2dVar) {
        return Integer.valueOf(n2dVar.n0);
    }

    @Override // defpackage.yd7
    public void j() {
        switch (this.E) {
            case 7:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    public Signature[] m(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.yd7
    public y3i n(int i, int i2) {
        switch (this.E) {
            case 7:
                throw new UnsupportedOperationException();
            default:
                return new r56();
        }
    }

    @Override // defpackage.sac
    public Object o0() {
        return new ConcurrentSkipListMap();
    }

    @Override // defpackage.yd7
    public void q(vef vefVar) {
        switch (this.E) {
            case 7:
                throw new UnsupportedOperationException();
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(android.content.Context r5, java.lang.String r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.egj
            if (r0 == 0) goto L13
            r0 = r7
            egj r0 = (defpackage.egj) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            egj r0 = new egj
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.E
            int r7 = r0.G
            r1 = 1
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L25
            defpackage.sf5.h0(r4)
            goto L6a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r4)
            r5.getClass()
            bgj r4 = defpackage.bgj.d(r5)
            r4.getClass()
            androidx.work.impl.WorkDatabase r5 = r4.c
            ggj r4 = r4.d
            r5.getClass()
            r4.getClass()
            r6.getClass()
            cm5 r7 = new cm5
            r2 = 25
            r7.<init>(r6, r2)
            knf r4 = r4.a
            r4.getClass()
            ytf r6 = new ytf
            r2 = 10
            r6.<init>(r7, r2, r5)
            java.lang.String r5 = "loadStatusFuture"
            o92 r4 = defpackage.rwj.i(r4, r5, r6)
            r0.G = r1
            java.lang.Object r4 = defpackage.uwj.c(r4, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L6a
            return r5
        L6a:
            java.util.List r4 = (java.util.List) r4
            int r5 = r4.size()
            r6 = 0
            r7 = r6
        L72:
            if (r7 >= r5) goto L92
            java.lang.Object r0 = r4.get(r7)
            agj r0 = (defpackage.agj) r0
            zfj r2 = defpackage.zfj.F
            zfj r3 = defpackage.zfj.E
            zfj[] r2 = new defpackage.zfj[]{r2, r3}
            java.util.List r2 = defpackage.x44.X(r2)
            zfj r0 = r0.b
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L8f
            goto L93
        L8f:
            int r7 = r7 + 1
            goto L72
        L92:
            r1 = r6
        L93:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl4.r(android.content.Context, java.lang.String, vp4):java.lang.Object");
    }

    public /* synthetic */ zl4(int i) {
        this.E = i;
    }
}
