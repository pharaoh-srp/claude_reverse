package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzhx;
import java.security.KeyFactory;
import java.security.Provider;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class bm4 implements sac, bxg, qo6, ljd {
    public static n6e b(bm4 bm4Var, long j, long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        bm4Var.getClass();
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(zoneIdSystemDefault).toLocalDate();
        LocalDate localDate2 = Instant.ofEpochMilli(j2).atZone(zoneIdSystemDefault).toLocalDate();
        long jBetween = ChronoUnit.DAYS.between(localDate, localDate2);
        if (jBetween <= 0) {
            return n6e.G;
        }
        if (jBetween == 1) {
            return n6e.H;
        }
        if (jBetween < 7) {
            return n6e.I;
        }
        if (jBetween < 14) {
            return n6e.J;
        }
        if (localDate.getYear() == localDate2.getYear() && localDate.getMonth() == localDate2.getMonth()) {
            return n6e.K;
        }
        LocalDate localDateMinusMonths = localDate2.minusMonths(1L);
        return (localDate.getYear() == localDateMinusMonths.getYear() && localDate.getMonth() == localDateMinusMonths.getMonth()) ? n6e.L : localDate.getYear() == localDate2.getYear() ? n6e.M : n6e.N;
    }

    public static ar9 d(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = ar9.M.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ar9) next).E.equals(str)) {
                break;
            }
        }
        return (ar9) next;
    }

    public static int h() {
        return c06.l;
    }

    public static int i() {
        return c06.i;
    }

    public static int j() {
        return c06.e;
    }

    public static int k() {
        return c06.h;
    }

    public static int l() {
        return c06.f;
    }

    public static int m() {
        return c06.g;
    }

    public static int n() {
        return c06.j;
    }

    public static long p(long j, h79 h79Var, vif vifVar) {
        long jM;
        int i = kkh.c;
        long jA = h79Var.a((int) (j >> 32), true);
        long jA2 = kkh.d(j) ? jA : h79Var.a((int) (j & 4294967295L), true);
        d9j d9jVar = null;
        d9j d9jVar2 = vifVar != null ? vifVar.a : null;
        if (kkh.d(j)) {
            d9jVar = d9jVar2;
        } else if (vifVar != null) {
            d9jVar = vifVar.b;
        }
        if (d9jVar2 != null && !kkh.d(jA)) {
            int iOrdinal = d9jVar2.ordinal();
            if (iOrdinal == 0) {
                int i2 = (int) (jA >> 32);
                jA = mwa.m(i2, i2);
            } else {
                if (iOrdinal != 1) {
                    mr9.b();
                    return 0L;
                }
                int i3 = (int) (jA & 4294967295L);
                jA = mwa.m(i3, i3);
            }
        }
        if (d9jVar != null && !kkh.d(jA2)) {
            int iOrdinal2 = d9jVar.ordinal();
            if (iOrdinal2 == 0) {
                int i4 = (int) (jA2 >> 32);
                jM = mwa.m(i4, i4);
            } else {
                if (iOrdinal2 != 1) {
                    mr9.b();
                    return 0L;
                }
                int i5 = (int) (jA2 & 4294967295L);
                jM = mwa.m(i5, i5);
            }
            jA2 = jM;
        }
        int iMin = Math.min(kkh.g(jA), kkh.g(jA2));
        int iMax = Math.max(kkh.f(jA), kkh.f(jA2));
        return kkh.h(j) ? mwa.m(iMax, iMin) : mwa.m(iMin, iMax);
    }

    public static String q(ContentResolver contentResolver, String str) throws zzhx {
        Uri uri = ylk.a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new zzhx("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzhx("ContentProvider query returned null cursor");
                    }
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return string;
                } finally {
                }
            } catch (RemoteException e) {
                throw new zzhx("ContentProvider query failed", e);
            }
        } catch (Throwable th) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th;
        }
    }

    public static HashMap r(ContentResolver contentResolver, String[] strArr, am4 am4Var) throws zzhx {
        Uri uri = ylk.b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new zzhx("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzhx("ContentProvider query returned null cursor");
                    }
                    HashMap map = new HashMap(cursorQuery.getCount(), 1.0f);
                    while (cursorQuery.moveToNext()) {
                        map.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new zzhx("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map;
                } finally {
                }
            } catch (Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.release();
                throw th;
            }
        } catch (RemoteException e) {
            throw new zzhx("ContentProvider query failed", e);
        }
    }

    public static final CharSequence s(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // defpackage.bxg
    public boolean a(jw7 jw7Var) {
        String str = jw7Var.o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // defpackage.bxg
    public dxg c(jw7 jw7Var) {
        String str = jw7Var.o;
        List list = jw7Var.r;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    hi6 hi6Var = new hi6();
                    ssc sscVar = new ssc((byte[]) list.get(0));
                    int iG = sscVar.G();
                    int iG2 = sscVar.G();
                    Paint paint = new Paint();
                    hi6Var.E = paint;
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    paint.setPathEffect(null);
                    Paint paint2 = new Paint();
                    hi6Var.F = paint2;
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                    paint2.setPathEffect(null);
                    hi6Var.G = new Canvas();
                    hi6Var.H = new bi6(719, 575, 0, 719, 0, 575);
                    hi6Var.I = new ai6(0, new int[]{0, -1, -16777216, -8421505}, hi6.m(), hi6.n());
                    hi6Var.J = new gi6(iG, iG2);
                    return hi6Var;
                case "application/pgs":
                    return new c61(18);
                case "application/x-mp4-vtt":
                    return new kv8(1);
                case "text/vtt":
                    return new b9j();
                case "application/x-quicktime-tx3g":
                    return new e9i(list);
                case "text/x-ssa":
                    return new cjg(list);
                case "application/vobsub":
                    return new t0j(list);
                case "application/x-subrip":
                    return new kvg();
                case "application/ttml+xml":
                    return new u8i();
            }
        }
        sz6.p(ij0.i("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.bxg
    public int e(jw7 jw7Var) {
        String str = jw7Var.o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        sz6.p(ij0.i("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // defpackage.qo6
    public Object f(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // defpackage.ljd
    public void g(dxc dxcVar, a2h a2hVar) {
        dxcVar.getClass();
        a2hVar.getClass();
    }

    public boolean o(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.sac
    public Object o0() {
        return new TreeMap();
    }
}
