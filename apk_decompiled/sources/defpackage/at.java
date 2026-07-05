package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.internal.play_billing.e;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class at implements qdg {
    public final /* synthetic */ int E;
    public int F;
    public Object G;

    public at(int i) {
        this.E = i;
        switch (i) {
            case 2:
                this.G = ghk.b;
                this.F = 0;
                break;
            case 7:
                this.F = 255;
                this.G = null;
                break;
            case 9:
                this.G = new LinkedHashMap();
                break;
            case 11:
                this.G = new ssc(8);
                break;
            default:
                this.F = 0;
                this.G = new StringBuilder();
                break;
        }
    }

    public static void n(int i, int i2, int[] iArr) {
        int i3 = ((i + i2) / 2) & (-2);
        int i4 = iArr[i3];
        int i5 = iArr[i3 + 1];
        int i6 = i;
        int i7 = i2;
        while (i6 <= i7) {
            while (i6 < i2) {
                int i8 = iArr[i6] - i4;
                if (i8 == 0) {
                    i8 = i5 - iArr[i6 + 1];
                }
                if (i8 >= 0) {
                    break;
                } else {
                    i6 += 2;
                }
            }
            while (i7 > i) {
                int i9 = iArr[i7] - i4;
                if (i9 == 0) {
                    i9 = i5 - iArr[i7 + 1];
                }
                if (i9 <= 0) {
                    break;
                } else {
                    i7 -= 2;
                }
            }
            if (i6 <= i7) {
                if (i6 != i7) {
                    int i10 = iArr[i6];
                    iArr[i6] = iArr[i7];
                    iArr[i7] = i10;
                    int i11 = i6 + 1;
                    int i12 = iArr[i11];
                    int i13 = i7 + 1;
                    iArr[i11] = iArr[i13];
                    iArr[i13] = i12;
                }
                i6 += 2;
                i7 -= 2;
            }
        }
        if (i < i7) {
            n(i, i7, iArr);
        }
        if (i6 < i2) {
            n(i6, i2, iArr);
        }
    }

    public void a(int i, int[] iArr) {
        int i2 = 0;
        if (i >= 0) {
            while (i2 < iArr.length) {
                d(iArr[i2], iArr[i2 + 1]);
                i2 += 2;
            }
            return;
        }
        int i3 = 0;
        while (i2 < iArr.length) {
            int i4 = iArr[i2];
            int i5 = iArr[i2 + 1];
            int i6 = i4 - 1;
            if (i3 <= i6) {
                d(i3, i6);
            }
            i3 = i5 + 1;
            i2 += 2;
        }
        if (i3 <= 1114111) {
            d(i3, 1114111);
        }
    }

    public void b(int i, int i2) {
        if (i <= 65 && i2 >= 66639) {
            d(i, i2);
            return;
        }
        if (i2 < 65 || i > 66639) {
            d(i, i2);
            return;
        }
        if (i < 65) {
            d(i, 64);
            i = 65;
        }
        if (i2 > 66639) {
            d(66640, i2);
            i2 = 66639;
        }
        while (i <= i2) {
            d(i, i);
            for (int iG = xzk.G(i); iG != i; iG = xzk.G(iG)) {
                d(iG, iG);
            }
            i++;
        }
    }

    public void c(ii2 ii2Var, boolean z) {
        int[] iArrR = ii2Var.b;
        if (z) {
            at atVar = new at(2);
            for (int i = 0; i < iArrR.length; i += 2) {
                atVar.b(iArrR[i], iArrR[i + 1]);
            }
            atVar.f();
            iArrR = atVar.r();
        }
        a(ii2Var.a, iArrR);
    }

    public void d(int i, int i2) {
        if (this.F > 0) {
            for (int i3 = 2; i3 <= 4; i3 += 2) {
                int i4 = this.F;
                if (i4 >= i3) {
                    int[] iArr = (int[]) this.G;
                    int i5 = i4 - i3;
                    int i6 = iArr[i5];
                    int i7 = i5 + 1;
                    int i8 = iArr[i7];
                    if (i <= i8 + 1 && i6 <= i2 + 1) {
                        if (i < i6) {
                            iArr[i5] = i;
                        }
                        if (i2 > i8) {
                            iArr[i7] = i2;
                            return;
                        }
                        return;
                    }
                }
            }
        }
        int i9 = this.F;
        int i10 = i9 + 2;
        int[] iArr2 = (int[]) this.G;
        if (iArr2.length < i10) {
            int i11 = i9 * 2;
            if (i10 < i11) {
                i10 = i11;
            }
            int[] iArr3 = new int[i10];
            System.arraycopy(iArr2, 0, iArr3, 0, i9);
            this.G = iArr3;
        }
        int[] iArr4 = (int[]) this.G;
        int i12 = this.F;
        int i13 = i12 + 1;
        this.F = i13;
        iArr4[i12] = i;
        this.F = i12 + 2;
        iArr4[i13] = i2;
    }

    public void e(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            int i = iArr2[0];
            int i2 = iArr2[1];
            int i3 = iArr2[2];
            if (i3 == 1) {
                d(i, i2);
            } else {
                while (i <= i2) {
                    d(i, i);
                    i += i3;
                }
            }
        }
    }

    public void f() {
        int i = this.F;
        if (i < 4) {
            return;
        }
        n(0, i - 2, (int[]) this.G);
        int i2 = 2;
        for (int i3 = 2; i3 < this.F; i3 += 2) {
            int[] iArr = (int[]) this.G;
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            int i6 = i2 - 1;
            int i7 = iArr[i6];
            if (i4 > i7 + 1) {
                iArr[i2] = i4;
                iArr[i2 + 1] = i5;
                i2 += 2;
            } else if (i5 > i7) {
                iArr[i6] = i5;
            }
        }
        this.F = i2;
    }

    public void g() {
        this.F = 0;
        Iterator it = ((LinkedHashMap) this.G).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                k5e k5eVar = (k5e) w44.N0(arrayList);
                if ((k5eVar != null ? (Bitmap) k5eVar.b.get() : null) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((k5e) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public int h(int i) {
        CharSequence charSequence = (CharSequence) this.G;
        return ghk.g((i <= 0 || i > charSequence.length()) ? -1 : Character.codePointBefore(charSequence, i), i < charSequence.length() ? Character.codePointAt(charSequence, i) : -1);
    }

    public bt i() {
        ws wsVar = (ws) this.G;
        bt btVar = new bt(wsVar.a, this.F);
        View view = wsVar.e;
        zs zsVar = btVar.K;
        if (view != null) {
            zsVar.r = view;
        } else {
            CharSequence charSequence = wsVar.d;
            if (charSequence != null) {
                zsVar.d = charSequence;
                TextView textView = zsVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = wsVar.c;
            if (drawable != null) {
                zsVar.n = drawable;
                ImageView imageView = zsVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    zsVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = wsVar.f;
        if (charSequence2 != null) {
            pq1 pq1Var = wsVar.g;
            zsVar.getClass();
            Message messageObtainMessage = pq1Var != null ? zsVar.z.obtainMessage(-2, pq1Var) : null;
            zsVar.j = charSequence2;
            zsVar.k = messageObtainMessage;
        }
        if (wsVar.i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) wsVar.b.inflate(zsVar.v, (ViewGroup) null);
            int i = wsVar.l ? zsVar.w : zsVar.x;
            ListAdapter ysVar = wsVar.i;
            if (ysVar == null) {
                ysVar = new ys(wsVar.a, i, R.id.text1, null);
            }
            zsVar.s = ysVar;
            zsVar.t = wsVar.m;
            if (wsVar.j != null) {
                alertController$RecycleListView.setOnItemClickListener(new vs(wsVar, zsVar));
            }
            if (wsVar.l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            zsVar.e = alertController$RecycleListView;
        }
        View view2 = wsVar.k;
        if (view2 != null) {
            zsVar.f = view2;
            zsVar.g = false;
        }
        btVar.setCancelable(true);
        btVar.setCanceledOnTouchOutside(true);
        btVar.setOnCancelListener(null);
        btVar.setOnDismissListener(null);
        xcb xcbVar = wsVar.h;
        if (xcbVar != null) {
            btVar.setOnKeyListener(xcbVar);
        }
        return btVar;
    }

    public synchronized pab j(nab nabVar) {
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.G).get(nabVar);
            pab pabVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                k5e k5eVar = (k5e) arrayList.get(i);
                Bitmap bitmap = (Bitmap) k5eVar.b.get();
                pab pabVar2 = bitmap != null ? new pab(bitmap, k5eVar.c) : null;
                if (pabVar2 != null) {
                    pabVar = pabVar2;
                    break;
                }
                i++;
            }
            int i2 = this.F;
            this.F = i2 + 1;
            if (i2 >= 10) {
                g();
            }
            return pabVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int k() {
        return this.F;
    }

    public yr9 l() {
        return (yr9) this.G;
    }

    public boolean m() {
        return ((gh6) this.G) != null;
    }

    public long o(fr5 fr5Var) {
        ssc sscVar = (ssc) this.G;
        int i = 0;
        fr5Var.d(sscVar.a, 0, 1, false);
        int i2 = sscVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = FreeTypeConstants.FT_LOAD_PEDANTIC;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        fr5Var.d(sscVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (sscVar.a[i] & 255) + (i5 << 8);
        }
        this.F = i4 + 1 + this.F;
        return i5;
    }

    public synchronized void p(nab nabVar, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.G;
            Object arrayList = linkedHashMap.get(nabVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(nabVar, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            k5e k5eVar = new k5e(iIdentityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList2.add(k5eVar);
                    break;
                }
                k5e k5eVar2 = (k5e) arrayList2.get(i2);
                if (i < k5eVar2.d) {
                    i2++;
                } else if (k5eVar2.a == iIdentityHashCode && k5eVar2.b.get() == bitmap) {
                    arrayList2.set(i2, k5eVar);
                } else {
                    arrayList2.add(i2, k5eVar);
                }
            }
            int i3 = this.F;
            this.F = i3 + 1;
            if (i3 >= 10) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int q(int i) {
        if (i >= this.F) {
            return -8;
        }
        int iCodePointAt = Character.codePointAt((CharSequence) this.G, i);
        return Character.charCount(iCodePointAt) | (iCodePointAt << 3);
    }

    public int[] r() {
        int i = this.F;
        int[] iArr = (int[]) this.G;
        if (i == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public String s(e eVar) {
        boolean z = false;
        switch (this.E) {
            case 14:
                zo1 zo1Var = (zo1) this.G;
                zo1Var.t(new mvd(zo1Var, eVar, z, 13), this.F);
                return "reconnectIfNeeded";
            default:
                t2k t2kVar = (t2k) this.G;
                int i = this.F;
                try {
                    if (t2kVar.H == null) {
                        throw null;
                    }
                    utj utjVar = t2kVar.H;
                    String packageName = t2kVar.F.getPackageName();
                    String str = i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "IS_FEATURE_SUPPORTED" : "CONSUME_ASYNC" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
                    i2k i2kVar = new i2k(eVar);
                    jtj jtjVar = (jtj) utjVar;
                    Parcel parcelM = jtjVar.M();
                    parcelM.writeString(packageName);
                    parcelM.writeString(str);
                    int i2 = atj.a;
                    parcelM.writeStrongBinder(i2kVar);
                    try {
                        jtjVar.j.transact(1, parcelM, null, 1);
                        parcelM.recycle();
                        return "billingOverrideService.getBillingOverride";
                    } catch (Throwable th) {
                        parcelM.recycle();
                        throw th;
                    }
                } catch (Exception e) {
                    t2kVar.H(95, 28, y3k.q);
                    jyj.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
                    eVar.a(0);
                    return "billingOverrideService.getBillingOverride";
                }
        }
    }

    public String toString() {
        int i = 0;
        switch (this.E) {
            case 2:
                int[] iArr = (int[]) this.G;
                int i2 = this.F;
                StringBuilder sb = new StringBuilder("[");
                while (i < i2) {
                    if (i > 0) {
                        sb.append(' ');
                    }
                    int i3 = iArr[i];
                    int i4 = iArr[i + 1];
                    if (i3 == i4) {
                        sb.append("0x");
                        sb.append(Integer.toHexString(i3));
                    } else {
                        sb.append("0x");
                        sb.append(Integer.toHexString(i3));
                        sb.append("-0x");
                        sb.append(Integer.toHexString(i4));
                    }
                    i += 2;
                }
                sb.append(']');
                return sb.toString();
            case 12:
                gz8 gz8Var = (gz8) this.G;
                ArrayList arrayList = new ArrayList(gz8Var.F);
                while (true) {
                    int i5 = gz8Var.F;
                    if (i >= i5) {
                        return "UnsupportedBrands{major=" + tpi.L(this.F) + ", compatible=" + arrayList + "}";
                    }
                    fd9.G(i, i5);
                    arrayList.add(tpi.L(gz8Var.E[i]));
                    i++;
                }
                break;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ at(Object obj, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
    }

    public at(hh4 hh4Var, int i) {
        this.E = 13;
        dgj.v(hh4Var);
        this.G = hh4Var;
        this.F = i;
    }

    public /* synthetic */ at(int i, boolean z) {
        this.E = i;
    }

    public at(int[] iArr) {
        this.E = 2;
        this.G = iArr;
        this.F = iArr.length;
    }

    public at(int i, int[] iArr) {
        gz8 gz8Var;
        this.E = 12;
        this.F = i;
        if (iArr != null) {
            gz8 gz8Var2 = gz8.G;
            gz8Var = iArr.length == 0 ? gz8.G : new gz8(Arrays.copyOf(iArr, iArr.length));
        } else {
            gz8Var = gz8.G;
        }
        this.G = gz8Var;
    }

    public at(Context context) {
        this.E = 0;
        int iJ = bt.j(context, 0);
        this.G = new ws(new ContextThemeWrapper(context, bt.j(context, iJ)));
        this.F = iJ;
    }

    public at(boolean z, boolean z2, boolean z3) {
        this.E = 6;
        this.F = (z || z2 || z3) ? 1 : 0;
    }
}
