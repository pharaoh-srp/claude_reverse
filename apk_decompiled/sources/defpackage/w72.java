package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.database.Cursor;
import android.provider.CalendarContract;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w72 {
    public final Context a;

    public w72(Context context) {
        this.a = context;
    }

    public final ArrayList a(String str, String[] strArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.a.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, new String[]{"account_name", "account_type"}, str, strArr, null);
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("account_name");
                int columnIndex2 = cursorQuery.getColumnIndex("account_type");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    String string2 = cursorQuery.getString(columnIndex2);
                    if (string != null && string2 != null) {
                        arrayList.add(new Account(string, string2));
                    }
                }
                cursorQuery.close();
            } finally {
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Account account = (Account) obj;
            if (hashSet.add(account.name + ":" + account.type)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w72.b(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            r8 = this;
            android.content.Context r0 = r8.a
            android.content.ContentResolver r1 = r0.getContentResolver()
            java.lang.String r0 = "isPrimary"
            java.lang.String r7 = "_id"
            java.lang.String[] r3 = new java.lang.String[]{r7, r0}
            android.net.Uri r2 = android.provider.CalendarContract.Calendars.CONTENT_URI     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = "isPrimary = 1"
            r5 = 0
            r6 = 0
            android.database.Cursor r4 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L2c
            if (r4 == 0) goto L3b
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L31
            int r0 = r4.getColumnIndexOrThrow(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Throwable -> L2e
            r4.close()     // Catch: java.lang.Exception -> L2c
            return r0
        L2c:
            r0 = move-exception
            goto L69
        L2e:
            r0 = move-exception
            r1 = r0
            goto L35
        L31:
            r4.close()     // Catch: java.lang.Exception -> L2c
            goto L3b
        L35:
            throw r1     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            defpackage.wd6.Z(r4, r1)     // Catch: java.lang.Exception -> L2c
            throw r0     // Catch: java.lang.Exception -> L2c
        L3b:
            java.lang.String r4 = "calendar_access_level >= ?"
            java.lang.String r0 = "500"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L2c
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L2c
            if (r1 == 0) goto Lc0
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5f
            int r0 = r1.getColumnIndexOrThrow(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L5c
            r1.close()     // Catch: java.lang.Exception -> L2c
            return r0
        L5c:
            r0 = move-exception
            r2 = r0
            goto L63
        L5f:
            r1.close()     // Catch: java.lang.Exception -> L2c
            goto Lc0
        L63:
            throw r2     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            defpackage.wd6.Z(r1, r2)     // Catch: java.lang.Exception -> L2c
            throw r0     // Catch: java.lang.Exception -> L2c
        L69:
            yfa r1 = defpackage.zfa.a
            r1.getClass()
            boolean r1 = defpackage.yfa.b()
            if (r1 != 0) goto L75
            goto Lc0
        L75:
            java.lang.String r8 = defpackage.iuj.E(r8)
            java.util.concurrent.CopyOnWriteArrayList r1 = defpackage.yfa.b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L84:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L9a
            java.lang.Object r3 = r1.next()
            r4 = r3
            zfa r4 = (defpackage.zfa) r4
            n30 r4 = (defpackage.n30) r4
            r4.getClass()
            r2.add(r3)
            goto L84
        L9a:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto Lc0
            yfa r1 = defpackage.zfa.a
            java.lang.String r3 = "Failed to get primary calendar: "
            java.lang.String r0 = defpackage.sq6.q(r1, r0, r3)
            java.util.Iterator r1 = r2.iterator()
        Lac:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r1.next()
            zfa r2 = (defpackage.zfa) r2
            n30 r2 = (defpackage.n30) r2
            sfa r3 = defpackage.sfa.ERROR
            r2.b(r3, r8, r0)
            goto Lac
        Lc0:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w72.c():java.lang.String");
    }

    public final boolean d(String str) {
        try {
            Cursor cursorQuery = this.a.getContentResolver().query(CalendarContract.Calendars.CONTENT_URI, new String[]{"_id"}, "_id = ?", new String[]{str}, null);
            if (cursorQuery == null) {
                return false;
            }
            try {
                boolean zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
                return zMoveToFirst;
            } finally {
            }
        } catch (Exception e) {
            zfa.a.getClass();
            if (!yfa.b()) {
                return false;
            }
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            zfa.a.getClass();
            String strK = ij0.k("Failed to validate calendar ID: ", str, ": ", gsk.c(e));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strK);
            }
            return false;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[Catch: all -> 0x00b0, Exception -> 0x00b4, TryCatch #2 {Exception -> 0x00b4, blocks: (B:12:0x004a, B:36:0x00bf, B:38:0x00db, B:43:0x00e9, B:45:0x00f0, B:48:0x0107, B:49:0x0116, B:51:0x011c, B:52:0x012d, B:54:0x0133, B:58:0x013d, B:59:0x0165, B:61:0x016b, B:27:0x00ac, B:33:0x00b7, B:34:0x00ba), top: B:125:0x004a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[Catch: all -> 0x00b0, Exception -> 0x00b4, TryCatch #2 {Exception -> 0x00b4, blocks: (B:12:0x004a, B:36:0x00bf, B:38:0x00db, B:43:0x00e9, B:45:0x00f0, B:48:0x0107, B:49:0x0116, B:51:0x011c, B:52:0x012d, B:54:0x0133, B:58:0x013d, B:59:0x0165, B:61:0x016b, B:27:0x00ac, B:33:0x00b7, B:34:0x00ba), top: B:125:0x004a, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResult e(boolean r23) {
        /*
            Method dump skipped, instruction units count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w72.e(boolean):com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResult");
    }
}
