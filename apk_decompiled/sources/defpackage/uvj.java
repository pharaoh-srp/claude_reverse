package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class uvj implements aik {
    public final /* synthetic */ int E;
    public Object F;
    public Object G;
    public Object H;

    public uvj(String str, int i) {
        this.E = i;
        switch (i) {
            case 3:
                uvj uvjVar = new uvj(2);
                this.G = uvjVar;
                this.H = uvjVar;
                this.F = str;
                break;
            default:
                lrb lrbVar = new lrb(29, false);
                this.G = lrbVar;
                this.H = lrbVar;
                this.F = str;
                break;
        }
    }

    public void a(Throwable th) throws Throwable {
        boolean z = th instanceof TimeoutException;
        t2k t2kVar = (t2k) this.H;
        if (z) {
            t2kVar.H(102, 28, y3k.q);
            jyj.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            t2kVar.H(95, 28, y3k.q);
            jyj.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((ije) this.G).run();
    }

    public void b(String str, Object obj) {
        lrb lrbVar = new lrb(29, false);
        ((lrb) this.H).H = lrbVar;
        this.H = lrbVar;
        lrbVar.G = obj;
        lrbVar.F = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:30:0x00b4, B:9:0x0028, B:11:0x0049, B:12:0x0055, B:14:0x0060, B:20:0x0071, B:21:0x007c, B:22:0x007d, B:24:0x0096, B:26:0x00a1, B:28:0x00ac, B:29:0x00b0), top: B:39:0x0020, inners: #0 }] */
    @Override // defpackage.aik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvj.d(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public String toString() {
        String str = "";
        switch (this.E) {
            case 0:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.F);
                sb.append('{');
                lrb lrbVar = (lrb) ((lrb) this.G).H;
                while (lrbVar != null) {
                    Object obj = lrbVar.G;
                    sb.append(str);
                    String str2 = (String) lrbVar.F;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                    }
                    lrbVar = (lrb) lrbVar.H;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.F);
                sb2.append('{');
                uvj uvjVar = (uvj) ((uvj) this.G).H;
                while (uvjVar != null) {
                    Object obj2 = uvjVar.G;
                    sb2.append(str);
                    String str3 = (String) uvjVar.F;
                    if (str3 != null) {
                        sb2.append(str3);
                        sb2.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb2.append(obj2);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                    }
                    uvjVar = (uvj) uvjVar.H;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ uvj(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj2;
        this.G = obj3;
        this.H = obj;
    }

    public /* synthetic */ uvj(int i) {
        this.E = i;
    }
}
