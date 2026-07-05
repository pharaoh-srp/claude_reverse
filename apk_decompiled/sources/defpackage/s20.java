package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.firebase.encoders.EncodingException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class s20 implements vp1 {
    public int E;
    public Object F;
    public Object G;

    public s20(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.G = string;
        this.F = str;
        dgj.p(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable((String) this.F, i)) {
            i++;
        }
        this.E = i;
    }

    public void a() {
        krh krhVar;
        ImageView imageView = (ImageView) this.F;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            je6.a(drawable);
        }
        if (drawable == null || (krhVar = (krh) this.G) == null) {
            return;
        }
        ch0.d(drawable, krhVar, imageView.getDrawableState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r13 == r16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        return new defpackage.up1(r13, -2, r4 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
    
        return defpackage.up1.d;
     */
    @Override // defpackage.vp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.up1 b(defpackage.xd7 r19, long r20) {
        /*
            r18 = this;
            r0 = r18
            long r4 = r19.getPosition()
            long r1 = r19.getLength()
            long r1 = r1 - r4
            r6 = 112800(0x1b8a0, double:5.57306E-319)
            long r1 = java.lang.Math.min(r6, r1)
            int r1 = (int) r1
            java.lang.Object r2 = r0.G
            ssc r2 = (defpackage.ssc) r2
            r2.J(r1)
            byte[] r3 = r2.a
            r6 = 0
            r7 = r19
            r7.p(r3, r6, r1)
            int r1 = r2.c
            r6 = -1
            r10 = r6
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2c:
            int r3 = r2.a()
            r12 = 188(0xbc, float:2.63E-43)
            if (r3 < r12) goto La1
            byte[] r3 = r2.a
            int r12 = r2.b
        L38:
            if (r12 >= r1) goto L48
            r15 = r3[r12]
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 71
            if (r15 == r8) goto L4d
            int r12 = r12 + 1
            goto L38
        L48:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4d:
            int r3 = r12 + 188
            if (r3 <= r1) goto L52
            goto La6
        L52:
            int r6 = r0.E
            long r6 = defpackage.kvk.k(r2, r12, r6)
            int r8 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r0.F
            frh r8 = (defpackage.frh) r8
            long r6 = r8.b(r6)
            int r8 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r8 <= 0) goto L82
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 != 0) goto L74
            up1 r0 = new up1
            r3 = -1
            r1 = r6
            r0.<init>(r1, r3, r4)
            return r0
        L74:
            long r16 = r4 + r10
            up1 r12 = new up1
            r15 = 0
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12.<init>(r13, r15, r16)
            return r12
        L82:
            r13 = r6
            r6 = 100000(0x186a0, double:4.94066E-319)
            long r6 = r6 + r13
            int r6 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r6 <= 0) goto L9a
            long r0 = (long) r12
            long r10 = r4 + r0
            up1 r6 = new up1
            r9 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.<init>(r7, r9, r10)
            return r6
        L9a:
            long r6 = (long) r12
            r10 = r6
        L9c:
            r2.M(r3)
            long r6 = (long) r3
            goto L2c
        La1:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        La6:
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 == 0) goto Lb3
            long r16 = r4 + r6
            up1 r12 = new up1
            r15 = -2
            r12.<init>(r13, r15, r16)
            return r12
        Lb3:
            up1 r0 = defpackage.up1.d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s20.b(xd7, long):up1");
    }

    public f91 c() {
        if ("".isEmpty()) {
            return new f91((String) this.F, ((Long) this.G).longValue(), this.E);
        }
        sz6.j("Missing required properties:".concat(""));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ab  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.aee d(boolean r21) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s20.d(boolean):aee");
    }

    public Object e(int i) {
        SparseArray sparseArray = (SparseArray) this.F;
        if (this.E == -1) {
            this.E = 0;
        }
        while (true) {
            int i2 = this.E;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.E--;
        }
        while (this.E < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.E + 1)) {
            this.E++;
        }
        return sparseArray.valueAt(this.E);
    }

    public List f() {
        return (ArrayList) this.F;
    }

    public int g() {
        return this.E;
    }

    @Override // defpackage.vp1
    public void h() {
        ssc sscVar = (ssc) this.G;
        byte[] bArr = tpi.b;
        sscVar.getClass();
        sscVar.K(bArr, bArr.length);
    }

    public int i() {
        return this.E;
    }

    public int j() {
        int i = this.E;
        return i != 2 ? i != 3 ? 0 : 512 : FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
    }

    public void k(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.F;
        Context context = imageView.getContext();
        int[] iArr = t0e.f;
        lrb lrbVarP = lrb.P(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) lrbVarP.G;
        mvi.g(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) lrbVarP.G, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = xn5.c0(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                je6.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(lrbVarP.w(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(je6.b(typedArray.getInt(3, -1), null));
            }
            lrbVarP.S();
        } catch (Throwable th) {
            lrbVarP.S();
            throw th;
        }
    }

    public void l(Object obj, Object obj2) {
        int i = (this.E + 1) * 2;
        Object[] objArr = (Object[]) this.F;
        if (i > objArr.length) {
            this.F = Arrays.copyOf(objArr, bz8.e(objArr.length, i));
        }
        if (obj == null) {
            mr9.h(ij0.h("null key in entry: null=", obj2));
        } else if (obj2 == null) {
            mr9.h(grc.t(obj, "null value in entry: ", "=null"));
        }
        Object[] objArr2 = (Object[]) this.F;
        int i2 = this.E;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.E = i2 + 1;
    }

    public void m(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.E) * 2;
            Object[] objArr = (Object[]) this.F;
            if (size > objArr.length) {
                this.F = Arrays.copyOf(objArr, bz8.e(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l(entry.getKey(), entry.getValue());
        }
    }

    public void n(int i) {
        this.E = i;
    }

    public void o(String str) {
        this.F = str;
    }

    public void p(long j) {
        this.G = Long.valueOf(j);
    }

    public void q(String str, jf7 jf7Var) {
        int i = this.E + 1;
        int i2 = i + i;
        Object[] objArr = (Object[]) this.F;
        int length = objArr.length;
        if (i2 > length) {
            if (i2 < 0) {
                sz6.h("cannot store more than MAX_VALUE elements");
                return;
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int iHighestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = iHighestOneBit + iHighestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.F = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.F;
        int i4 = this.E;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = jf7Var;
        this.E = i4 + 1;
    }

    public byte[] r() {
        esj esjVar;
        tac tacVar;
        pyk pykVar = pyk.X;
        smk smkVar = (smk) this.F;
        ((ptk) this.G).h = false;
        ptk ptkVar = (ptk) this.G;
        ptkVar.f = Boolean.FALSE;
        smkVar.a = new zuk(ptkVar);
        try {
            pyk.G0();
            qnk qnkVar = new qnk(smkVar);
            lrb lrbVar = new lrb(27);
            pykVar.t0(lrbVar);
            HashMap map = new HashMap((HashMap) lrbVar.F);
            HashMap map2 = new HashMap((HashMap) lrbVar.G);
            urj urjVar = (urj) lrbVar.H;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                esjVar = new esj(byteArrayOutputStream, map, map2, urjVar);
                tacVar = (tac) map.get(qnk.class);
            } catch (IOException unused) {
            }
            if (tacVar == null) {
                throw new EncodingException("No encoder for ".concat(String.valueOf(qnk.class)));
            }
            tacVar.a(qnkVar, esjVar);
            return byteArrayOutputStream.toByteArray();
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public s20(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.E = i;
        this.G = str;
        this.F = arrayList;
    }

    public s20() {
        this.F = new Object[8];
        this.E = 0;
    }

    public s20(smk smkVar, int i) {
        this.G = new ptk();
        this.F = smkVar;
        pyk.G0();
        this.E = i;
    }

    public s20(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.F = arrayList;
        this.E = i;
        this.G = motionEvent;
        if (arrayList.isEmpty()) {
            sz6.p("changes cannot be empty");
            throw null;
        }
    }

    public s20(ImageView imageView) {
        this.E = 0;
        this.F = imageView;
    }

    public s20(int i) {
        this.F = new Object[i * 2];
        this.E = 0;
    }
}
