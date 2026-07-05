package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.anthropic.claude.types.strings.MessageId;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t9e {
    public static final a11 a = new a11();
    public static final xb b = new xb(6);

    public static final File A(Uri uri) {
        if (!x44.r(uri.getScheme(), "file")) {
            mr9.t("Uri lacks 'file' scheme: ", uri);
            return null;
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        mr9.t("Uri path is null: ", uri);
        return null;
    }

    public static final r20 B(Drawable drawable) {
        Bitmap bitmap;
        int minimumWidth = drawable.getMinimumWidth() > 0 ? drawable.getMinimumWidth() : Math.abs(drawable.getBounds().width());
        int minimumHeight = drawable.getMinimumHeight() > 0 ? drawable.getMinimumHeight() : Math.abs(drawable.getBounds().height());
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                sz6.p("bitmap is null");
                return null;
            }
            bitmap = (minimumWidth == bitmapDrawable.getBitmap().getWidth() && minimumHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), minimumWidth, minimumHeight, true);
        } else {
            Rect bounds = drawable.getBounds();
            int i = bounds.left;
            int i2 = bounds.top;
            int i3 = bounds.right;
            int i4 = bounds.bottom;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(minimumWidth, minimumHeight, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, minimumWidth, minimumHeight);
            drawable.draw(new Canvas(bitmapCreateBitmap));
            drawable.setBounds(i, i2, i3, i4);
            bitmap = bitmapCreateBitmap;
        }
        return new r20(bitmap);
    }

    public static void C(String str) {
        throw new IllegalArgumentException(ij0.k("Unsupported type: ", str, ". ", ij0.j("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.bpc r25, defpackage.iqb r26, final long r27, defpackage.mnc r29, long r30, defpackage.ld4 r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9e.a(bpc, iqb, long, mnc, long, ld4, int, int):void");
    }

    public static long b() {
        return no9.a;
    }

    public static long c() {
        return no9.s;
    }

    public static long d() {
        return no9.h;
    }

    public static long e() {
        return no9.e;
    }

    public static long f() {
        return no9.f;
    }

    public static long g() {
        return no9.g;
    }

    public static long h() {
        return no9.d;
    }

    public static long i() {
        return no9.r;
    }

    public static long j() {
        return no9.u;
    }

    public static long k() {
        return no9.c;
    }

    public static long l() {
        return no9.b;
    }

    public static long m() {
        return no9.E;
    }

    public static long n() {
        return no9.D;
    }

    public static long o() {
        return no9.C;
    }

    public static long p() {
        return no9.q;
    }

    public static long q() {
        return no9.p;
    }

    public static final boolean r(whd whdVar) {
        if (!(whdVar instanceof uhd)) {
            return false;
        }
        uhd uhdVar = (uhd) whdVar;
        return uhdVar.d && uhdVar.e.isEmpty();
    }

    public static final String s(String str) {
        Character chValueOf;
        str.getClass();
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                chValueOf = null;
                break;
            }
            char cCharAt = str.charAt(i);
            if (!gb9.B(cCharAt)) {
                chValueOf = Character.valueOf(cCharAt);
                break;
            }
            i++;
        }
        return ((chValueOf != null && chValueOf.charValue() == '{') || (chValueOf != null && chValueOf.charValue() == '[')) ? t(str) : grc.u("<redacted: ", str.length(), " chars>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0186, code lost:
    
        return u(r10, r23, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        return u(r10, r23, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
    
        return u(r10, r23, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0138, code lost:
    
        return u(r10, r23, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String t(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9e.t(java.lang.String):java.lang.String");
    }

    public static final String u(int i, String str, StringBuilder sb) {
        sb.append("<redacted: " + (str.length() - i) + " chars>");
        return sb.toString();
    }

    public static final LinkedHashMap v(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                value = t((String) value);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static final o09 w(String str, String str2, boolean z, cw7 cw7Var) {
        str.getClass();
        MessageId messageIdM1051boximpl = str2 != null ? MessageId.m1051boximpl(str2) : null;
        if (messageIdM1051boximpl != null) {
            messageIdM1051boximpl.m1057unboximpl();
        }
        if (z) {
            messageIdM1051boximpl = null;
        }
        String strM1057unboximpl = messageIdM1051boximpl != null ? messageIdM1051boximpl.m1057unboximpl() : null;
        MessageId[] messageIdArr = {MessageId.m1051boximpl(str), strM1057unboximpl != null ? MessageId.m1051boximpl(strM1057unboximpl) : null};
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z2 = false;
        for (int i = 0; i < 2; i++) {
            MessageId messageId = messageIdArr[i];
            if (messageId != null) {
                linkedHashSet.add(messageId);
            }
        }
        if (str2 == null || (cw7Var == cw7.F && !z)) {
            z2 = true;
        }
        return new o09(linkedHashSet, z2);
    }

    public static final auc x(Integer num, Integer num2, Integer num3, drd drdVar, String str, boolean z) {
        int iIntValue;
        lm6 lm6Var;
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return y(z, drdVar, str, iIntValue2, iIntValue);
        }
        auc aucVarY = y(z, drdVar, str, iIntValue2, iIntValue2);
        while (true) {
            lm6Var = lm6.E;
            if (iIntValue2 >= iMin) {
                break;
            }
            iIntValue2++;
            aucVarY = new auc(lm6Var, x44.X(y(z, drdVar, str, iIntValue2, iIntValue2), kud.f(x44.X(new auc(x44.W(new h4d(" ")), lm6Var), aucVarY))));
        }
        return iIntValue3 > iIntValue ? kud.f(x44.X(new auc(x44.W(new h4d(isg.m0(iIntValue3 - iIntValue, " "))), lm6Var), aucVarY)) : iIntValue3 == iIntValue ? aucVarY : new auc(lm6Var, x44.X(y(z, drdVar, str, iIntValue3 + 1, iIntValue), aucVarY));
    }

    public static final auc y(boolean z, drd drdVar, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            sz6.j("Check failed.");
            return null;
        }
        d8a d8aVarE = x44.E();
        if (z) {
            d8aVarE.add(new h4d("-"));
        }
        d8aVarE.add(new bac(x44.W(new ahi(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), drdVar, str, z))));
        return new auc(x44.v(d8aVarE), lm6.E);
    }

    public static final void z(List list, boolean z) {
        list.getClass();
        while (r((whd) w44.V0(list))) {
            list.remove(list.size() - 1);
            whd whdVar = (whd) w44.V0(list);
            if (z && (whdVar instanceof vhd) && ((vhd) whdVar).d) {
                list.remove(list.size() - 1);
            }
        }
    }
}
