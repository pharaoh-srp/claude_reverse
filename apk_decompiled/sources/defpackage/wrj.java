package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wrj extends k0l {
    public static final String[] J = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] K = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] L = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;"};
    public static final String[] M = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] N = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] O = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] P = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] Q = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] R = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] S = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final ftj H;
    public final g0l I;

    public wrj(o0l o0lVar) {
        super(o0lVar);
        this.I = new g0l(((umk) this.E).R);
        this.H = new ftj(this, ((umk) this.E).E);
    }

    public static void e1(ContentValues contentValues, Object obj) {
        dgj.s(ExperienceToggle.DEFAULT_PARAM_KEY);
        dgj.v(obj);
        if (obj instanceof String) {
            contentValues.put(ExperienceToggle.DEFAULT_PARAM_KEY, (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put(ExperienceToggle.DEFAULT_PARAM_KEY, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(ExperienceToggle.DEFAULT_PARAM_KEY, (Double) obj);
        } else {
            sz6.p("Invalid value type");
        }
    }

    public final void A1(String str, ArrayList arrayList) {
        dgj.s(str);
        O0();
        K0();
        SQLiteDatabase sQLiteDatabaseR0 = R0();
        try {
            long jY1 = y1("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, ((umk) this.E).K.R0(str, zvj.H)));
            if (jY1 <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                Integer num = (Integer) arrayList.get(i);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseR0.delete("audience_filter_values", ij0.j("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", ij0.j("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str), e, "Database error querying filters. appId");
        }
    }

    public final void B1(String str, qrk qrkVar) {
        dgj.v(str);
        dgj.v(qrkVar);
        K0();
        O0();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", qrkVar.o());
        contentValues.put("consent_source", Integer.valueOf(qrkVar.b));
        d1(contentValues);
    }

    public final long C1(String str) {
        dgj.s(str);
        K0();
        O0();
        return V0("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long D1(String str) {
        dgj.s(str);
        return V0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0059: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:14:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kqj E1(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.E1(java.lang.String, java.lang.String):kqj");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fvj F1(java.lang.String r29, java.lang.String r30, java.lang.String r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.F1(java.lang.String, java.lang.String, java.lang.String):fvj");
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b2: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:15:0x00b2 */
    /* JADX WARN: Removed duplicated region for block: B:146:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mjk G1(java.lang.String r52) {
        /*
            Method dump skipped, instruction units count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.G1(java.lang.String):mjk");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.f1l H1(java.lang.String r11, java.lang.String r12) throws java.lang.Throwable {
        /*
            r10 = this;
            defpackage.dgj.s(r11)
            defpackage.dgj.s(r12)
            r10.K0()
            r10.O0()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.R0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L34
            r2.close()
            return r1
        L34:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r9 = r10.W0(r2, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            if (r9 != 0) goto L44
            r2.close()
            return r1
        L44:
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            f1l r3 = new f1l     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            if (r11 == 0) goto L6d
            qgk r11 = r10.b0()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            ygk r11 = r11.J     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            vhk r0 = defpackage.qgk.Q0(r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            r11.c(r12, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L66:
            r0 = move-exception
            r10 = r0
            r1 = r2
            goto L9c
        L6a:
            r0 = move-exception
        L6b:
            r11 = r0
            goto L7d
        L6d:
            r2.close()
            return r3
        L71:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L6b
        L75:
            r0 = move-exception
            r10 = r0
            goto L9c
        L78:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L7d:
            qgk r12 = r10.b0()     // Catch: java.lang.Throwable -> L66
            ygk r12 = r12.J     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "Error querying user property. appId"
            vhk r3 = defpackage.qgk.Q0(r4)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r10 = r10.E     // Catch: java.lang.Throwable -> L66
            umk r10 = (defpackage.umk) r10     // Catch: java.lang.Throwable -> L66
            ogk r10 = r10.Q     // Catch: java.lang.Throwable -> L66
            java.lang.String r10 = r10.g(r6)     // Catch: java.lang.Throwable -> L66
            r12.d(r0, r3, r10, r11)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L9b
            r2.close()
        L9b:
            return r1
        L9c:
            if (r1 == 0) goto La1
            r1.close()
        La1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.H1(java.lang.String, java.lang.String):f1l");
    }

    public final qrk I1(String str) {
        dgj.v(str);
        K0();
        O0();
        return qrk.f(100, Y0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final void J1(String str, String str2) {
        dgj.s(str);
        dgj.s(str2);
        K0();
        O0();
        try {
            R0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            b0().J.d("Error deleting user property. appId", qgk.Q0(str), ((umk) this.E).Q.g(str2), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qrk K1(java.lang.String r4) throws java.lang.Throwable {
        /*
            r3 = this;
            defpackage.dgj.v(r4)
            r3.K0()
            r3.O0()
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r3.R0()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            android.database.Cursor r4 = r2.rawQuery(r0, r4)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            if (r0 != 0) goto L32
            qgk r0 = r3.b0()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            ygk r0 = r0.R     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "No data found"
            r0.b(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r4.close()
            goto L58
        L2d:
            r3 = move-exception
            r1 = r4
            goto L5e
        L30:
            r0 = move-exception
            goto L48
        L32:
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r2 = 1
            int r2 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            qrk r1 = defpackage.qrk.f(r2, r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r4.close()
            goto L58
        L44:
            r3 = move-exception
            goto L5e
        L46:
            r0 = move-exception
            r4 = r1
        L48:
            qgk r3 = r3.b0()     // Catch: java.lang.Throwable -> L2d
            ygk r3 = r3.J     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "Error querying database."
            r3.c(r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L58
            r4.close()
        L58:
            if (r1 != 0) goto L5d
            qrk r3 = defpackage.qrk.c
            return r3
        L5d:
            return r1
        L5e:
            if (r1 == 0) goto L63
            r1.close()
        L63:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.K1(java.lang.String):qrk");
    }

    public final void L1(String str, String str2) {
        dgj.s(str2);
        K0();
        O0();
        try {
            R0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str2), e, "Error deleting snapshot. appId");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor] */
    public final d1l M1(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        dgj.s(str);
        K0();
        O0();
        i4l.a();
        vqj vqjVar = ((umk) this.E).K;
        yek yekVar = zvj.y0;
        ?? r2 = 0;
        try {
            if (vqjVar.X0(null, yekVar)) {
                try {
                    cursorQuery = R0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, w1(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            cursorQuery.close();
                            return null;
                        }
                        String string = cursorQuery.getString(3);
                        if (TextUtils.isEmpty(string)) {
                            b0().Q.b("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                            cursorQuery.close();
                            return null;
                        }
                        try {
                            ohk ohkVar = (ohk) dik.e1(b0.v(), cursorQuery.getBlob(2));
                            int i = fsh.e()[cursorQuery.getInt(5)];
                            if ((i == 3 || i == 1) && cursorQuery.getInt(6) > 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = ohkVar.n().iterator();
                                while (it.hasNext()) {
                                    phk phkVar = (phk) ((c0) it.next()).l();
                                    int i2 = cursorQuery.getInt(6);
                                    phkVar.c();
                                    c0.q1((c0) phkVar.F, i2);
                                    arrayList.add((c0) phkVar.b());
                                }
                                ohkVar.k();
                                ohkVar.h(arrayList);
                            }
                            HashMap map = new HashMap();
                            String string2 = cursorQuery.getString(4);
                            if (string2 != null) {
                                String[] strArrSplit = string2.split("\r\n");
                                int length = strArrSplit.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    }
                                    String str2 = strArrSplit[i3];
                                    if (str2.isEmpty()) {
                                        break;
                                    }
                                    String[] strArrSplit2 = str2.split("=", 2);
                                    if (strArrSplit2.length != 2) {
                                        b0().J.c("Invalid upload header: ", str2);
                                        break;
                                    }
                                    map.put(strArrSplit2[0], strArrSplit2[1]);
                                    i3++;
                                }
                            }
                            d1l d1lVar = new d1l();
                            d1lVar.b(cursorQuery.getLong(0));
                            d1lVar.c((b0) ohkVar.b());
                            d1lVar.d(string);
                            d1lVar.e(map);
                            d1l d1lVarA = d1lVar.a();
                            cursorQuery.close();
                            return d1lVarA;
                        } catch (IOException e) {
                            this.b0().J.a(str, e, "Failed to queued MeasurementBatch from upload_queue. appId");
                            cursorQuery.close();
                            return null;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        b0().J.a(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r2 == 0) {
                        throw th;
                    }
                    r2.close();
                    throw th;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r2 = yekVar;
        }
    }

    public final List N1(String str) {
        String str2;
        dgj.s(str);
        K0();
        O0();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = R0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", ExperienceToggle.DEFAULT_PARAM_KEY}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str3 = string2;
                    long j = cursorQuery.getLong(2);
                    Object objW0 = W0(cursorQuery, 3);
                    if (objW0 == null) {
                        b0().J.c("Read invalid user property value, ignoring it. appId", qgk.Q0(str));
                        str2 = str;
                    } else {
                        str2 = str;
                        try {
                            arrayList.add(new f1l(str2, str3, string, j, objW0));
                        } catch (SQLiteException e) {
                            e = e;
                        }
                    }
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    str = str2;
                }
            } finally {
            }
        } catch (SQLiteException e2) {
            e = e2;
            str2 = str;
        }
        b0().J.a(qgk.Q0(str2), e, "Error querying user properties. appId");
        List list = Collections.EMPTY_LIST;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    public final void O1() {
        O0();
        R0().beginTransaction();
    }

    public final void P1(String str) {
        K0();
        O0();
        try {
            R0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e) {
            b0().J.c("Error clearing default event params", e);
        }
    }

    @Override // defpackage.k0l
    public final boolean Q0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[DONT_GENERATE, FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[DONT_GENERATE, FINALLY_INSNS, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q1(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "events_snapshot"
            r12.L1(r0, r13)
            java.lang.String r1 = "name"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.R0()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            java.lang.String r4 = "events"
            r11 = 0
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            java.lang.Object[] r1 = r1.toArray(r5)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            r5 = r1
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            if (r1 != 0) goto L33
            r2.close()
            return
        L33:
            java.lang.String r1 = r2.getString(r11)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            if (r1 == 0) goto L4a
            java.lang.String r3 = "events"
            fvj r1 = r12.F1(r3, r13, r1)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            if (r1 == 0) goto L4a
            r12.l1(r0, r1)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            goto L4a
        L45:
            r0 = move-exception
            r12 = r0
            goto L69
        L48:
            r0 = move-exception
            goto L54
        L4a:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteException -> L48
            if (r1 != 0) goto L33
            r2.close()
            return
        L54:
            qgk r12 = r12.b0()     // Catch: java.lang.Throwable -> L45
            ygk r12 = r12.J     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Error creating snapshot. appId"
            vhk r13 = defpackage.qgk.Q0(r13)     // Catch: java.lang.Throwable -> L45
            r12.a(r13, r0, r1)     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L68
            r2.close()
        L68:
            return
        L69:
            if (r2 == 0) goto L6e
            r2.close()
        L6e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.Q1(java.lang.String):void");
    }

    public final SQLiteDatabase R0() {
        K0();
        try {
            return this.H.getWritableDatabase();
        } catch (SQLiteException e) {
            this.b0().M.c("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R1(java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.R1(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String S0() throws java.lang.Throwable {
        /*
            r4 = this;
            android.database.sqlite.SQLiteDatabase r0 = r4.R0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1d
            if (r2 == 0) goto L1f
            r2 = 0
            java.lang.String r4 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1d
            r0.close()
            return r4
        L1a:
            r4 = move-exception
            r1 = r0
            goto L38
        L1d:
            r2 = move-exception
            goto L27
        L1f:
            r0.close()
            return r1
        L23:
            r4 = move-exception
            goto L38
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            qgk r4 = r4.b0()     // Catch: java.lang.Throwable -> L1a
            ygk r4 = r4.J     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = "Database error getting next bundle app id"
            r4.c(r3, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L37
            r0.close()
        L37:
            return r1
        L38:
            if (r1 == 0) goto L3d
            r1.close()
        L3d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.S0():java.lang.String");
    }

    public final boolean S1(String str) {
        i4l.a();
        return ((umk) this.E).K.X0(null, zvj.y0) && y1("SELECT COUNT(1) > 0 FROM upload_queue WHERE ".concat(w1()), new String[]{str}) != 0;
    }

    public final long T0(c0 c0Var) {
        K0();
        O0();
        dgj.s(c0Var.e2());
        byte[] bArrC = c0Var.c();
        long jS0 = L0().S0(bArrC);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c0Var.e2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jS0));
        contentValues.put("metadata", bArrC);
        try {
            R0().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jS0;
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(c0Var.e2()), e, "Error storing raw event metadata. appId");
            throw e;
        }
    }

    public final void T1() {
        O0();
        R0().endTransaction();
    }

    public final long U0(String str) {
        dgj.s(str);
        K0();
        O0();
        try {
            return R0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((umk) this.E).K.R0(str, zvj.q))))});
        } catch (SQLiteException e) {
            this.b0().J.a(qgk.Q0(str), e, "Error deleting over the limit events. appId");
            return 0L;
        }
    }

    public final void U1() {
        umk umkVar = (umk) this.E;
        K0();
        O0();
        if (v1()) {
            o0l o0lVar = this.F;
            long jA = o0lVar.M.I.a();
            umkVar.R.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) zvj.z.a(null)).longValue()) {
                o0lVar.M.I.b(jElapsedRealtime);
                K0();
                O0();
                if (v1()) {
                    SQLiteDatabase sQLiteDatabaseR0 = R0();
                    umkVar.R.getClass();
                    int iDelete = sQLiteDatabaseR0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(vqj.Z0())});
                    if (iDelete > 0) {
                        b0().R.c("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long V0(java.lang.String r3, java.lang.String[] r4, long r5) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.R0()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r4 == 0) goto L1c
            r4 = 0
            long r2 = r1.getLong(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            r1.close()
            return r2
        L18:
            r2 = move-exception
            goto L2c
        L1a:
            r4 = move-exception
            goto L20
        L1c:
            r1.close()
            return r5
        L20:
            qgk r2 = r2.b0()     // Catch: java.lang.Throwable -> L18
            ygk r2 = r2.J     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = "Database error"
            r2.a(r3, r4, r5)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L2c:
            if (r1 == 0) goto L31
            r1.close()
        L31:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.V0(java.lang.String, java.lang.String[], long):long");
    }

    public final void V1() {
        O0();
        R0().setTransactionSuccessful();
    }

    public final Object W0(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            b0().J.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            b0().J.c("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        b0().J.b("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String X0(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.K0()
            r3.O0()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.R0()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 != 0) goto L33
            qgk r5 = r3.b0()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            ygk r5 = r5.R     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.b(r1)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r0
        L2e:
            r3 = move-exception
            r0 = r4
            goto L51
        L31:
            r5 = move-exception
            goto L40
        L33:
            r5 = 0
            java.lang.String r3 = r4.getString(r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r3
        L3c:
            r3 = move-exception
            goto L51
        L3e:
            r5 = move-exception
            r4 = r0
        L40:
            qgk r3 = r3.b0()     // Catch: java.lang.Throwable -> L2e
            ygk r3 = r3.J     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "Error selecting expired configs"
            r3.c(r1, r5)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L50
            r4.close()
        L50:
            return r0
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.X0(long):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Y0(java.lang.String r3, java.lang.String[] r4) {
        /*
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.R0()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            if (r4 == 0) goto L1c
            r4 = 0
            java.lang.String r2 = r1.getString(r4)     // Catch: java.lang.Throwable -> L18 android.database.sqlite.SQLiteException -> L1a
            r1.close()
            return r2
        L18:
            r2 = move-exception
            goto L2e
        L1a:
            r4 = move-exception
            goto L22
        L1c:
            r1.close()
            java.lang.String r2 = ""
            return r2
        L22:
            qgk r2 = r2.b0()     // Catch: java.lang.Throwable -> L18
            ygk r2 = r2.J     // Catch: java.lang.Throwable -> L18
            java.lang.String r0 = "Database error"
            r2.a(r3, r4, r0)     // Catch: java.lang.Throwable -> L18
            throw r4     // Catch: java.lang.Throwable -> L18
        L2e:
            if (r1 == 0) goto L33
            r1.close()
        L33:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.Y0(java.lang.String, java.lang.String[]):java.lang.String");
    }

    public final List Z0(int i, int i2, String str) {
        byte[] bArrA1;
        long jY;
        long jY2;
        K0();
        O0();
        int i3 = 1;
        dgj.o(i > 0);
        dgj.o(i2 > 0);
        dgj.s(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = R0().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!cursorQuery.moveToFirst()) {
                    List list = Collections.EMPTY_LIST;
                    cursorQuery.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j = cursorQuery.getLong(0);
                    try {
                        bArrA1 = L0().A1(cursorQuery.getBlob(i3));
                    } catch (IOException e) {
                        b0().J.a(qgk.Q0(str), e, "Failed to unzip queued bundle. appId");
                    }
                    if (!arrayList.isEmpty() && bArrA1.length + length > i2) {
                        break;
                    }
                    try {
                        phk phkVar = (phk) dik.e1(c0.c2(), bArrA1);
                        if (!arrayList.isEmpty()) {
                            c0 c0Var = (c0) ((Pair) arrayList.get(0)).first;
                            c0 c0Var2 = (c0) phkVar.b();
                            if (!c0Var.H().equals(c0Var2.H()) || !c0Var.G().equals(c0Var2.G()) || c0Var.X() != c0Var2.X() || !c0Var.I().equals(c0Var2.I())) {
                                break;
                            }
                            Iterator it = c0Var.V().iterator();
                            while (true) {
                                jY = -1;
                                if (!it.hasNext()) {
                                    jY2 = -1;
                                    break;
                                }
                                g0 g0Var = (g0) it.next();
                                if ("_npa".equals(g0Var.C())) {
                                    jY2 = g0Var.y();
                                    break;
                                }
                            }
                            Iterator it2 = c0Var2.V().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                g0 g0Var2 = (g0) it2.next();
                                if ("_npa".equals(g0Var2.C())) {
                                    jY = g0Var2.y();
                                    break;
                                }
                            }
                            if (jY2 != jY) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            int i4 = cursorQuery.getInt(2);
                            phkVar.c();
                            c0.q1((c0) phkVar.F, i4);
                        }
                        length += bArrA1.length;
                        arrayList.add(Pair.create((c0) phkVar.b(), Long.valueOf(j)));
                    } catch (IOException e2) {
                        b0().J.a(qgk.Q0(str), e2, "Failed to merge queued bundle. appId");
                    }
                    if (!cursorQuery.moveToNext() || length > i2) {
                        break;
                    }
                    i3 = 1;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e3) {
                b0().J.a(qgk.Q0(str), e3, "Error querying bundles. appId");
                List list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List a1(String str, String str2, String str3) {
        dgj.s(str);
        K0();
        O0();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return b1(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        b0().J.c("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b1(java.lang.String r21, java.lang.String[] r22) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.b1(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final psj c1(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        dgj.s(str);
        K0();
        O0();
        String[] strArr = {str};
        psj psjVar = new psj();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseR0 = R0();
                Cursor cursorQuery = sQLiteDatabaseR0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    b0().M.c("Not updating daily counts, app is not known. appId", qgk.Q0(str));
                    cursorQuery.close();
                    return psjVar;
                }
                if (cursorQuery.getLong(0) == j) {
                    psjVar.b = cursorQuery.getLong(1);
                    psjVar.a = cursorQuery.getLong(2);
                    psjVar.c = cursorQuery.getLong(3);
                    psjVar.d = cursorQuery.getLong(4);
                    psjVar.e = cursorQuery.getLong(5);
                    psjVar.f = cursorQuery.getLong(6);
                }
                if (z) {
                    psjVar.b += j2;
                }
                if (z2) {
                    psjVar.a += j2;
                }
                if (z3) {
                    psjVar.c += j2;
                }
                if (z4) {
                    psjVar.d += j2;
                }
                if (z5) {
                    psjVar.e += j2;
                }
                if (z6) {
                    psjVar.f += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(psjVar.a));
                contentValues.put("daily_events_count", Long.valueOf(psjVar.b));
                contentValues.put("daily_conversions_count", Long.valueOf(psjVar.c));
                contentValues.put("daily_error_events_count", Long.valueOf(psjVar.d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(psjVar.e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(psjVar.f));
                sQLiteDatabaseR0.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return psjVar;
            } catch (SQLiteException e) {
                b0().J.a(qgk.Q0(str), e, "Error updating daily counts. appId");
                if (0 != 0) {
                    cursor.close();
                }
                return psjVar;
            }
        } finally {
        }
    }

    public final void d1(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseR0 = R0();
            if (contentValues.getAsString("app_id") == null) {
                b0().L.c("Value of the primary key is not set.", qgk.Q0("app_id"));
            } else if (sQLiteDatabaseR0.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && sQLiteDatabaseR0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                b0().J.a(qgk.Q0("consent_settings"), qgk.Q0("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e) {
            b0().J.d("Error storing into table. key", qgk.Q0("consent_settings"), qgk.Q0("app_id"), e);
        }
    }

    public final void f1(c0 c0Var, boolean z) {
        K0();
        O0();
        dgj.s(c0Var.e2());
        dgj.y(c0Var.u0());
        U1();
        ((umk) this.E).R.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c0Var.K1() < jCurrentTimeMillis - vqj.Z0() || c0Var.K1() > vqj.Z0() + jCurrentTimeMillis) {
            b0().M.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", qgk.Q0(c0Var.e2()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c0Var.K1()));
        }
        try {
            byte[] bArrX1 = L0().x1(c0Var.c());
            b0().R.c("Saving bundle, size", Integer.valueOf(bArrX1.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c0Var.e2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c0Var.K1()));
            contentValues.put("data", bArrX1);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c0Var.B0()) {
                contentValues.put("retry_count", Integer.valueOf(c0Var.j1()));
            }
            try {
                if (R0().insert("queue", null, contentValues) == -1) {
                    b0().J.c("Failed to insert bundle (got -1). appId", qgk.Q0(c0Var.e2()));
                }
            } catch (SQLiteException e) {
                b0().J.a(qgk.Q0(c0Var.e2()), e, "Error storing bundle. appId");
            }
        } catch (IOException e2) {
            b0().J.a(qgk.Q0(c0Var.e2()), e2, "Data loss. Failed to serialize bundle. appId");
        }
    }

    public final void g1(Long l) {
        K0();
        O0();
        i4l.a();
        if (((umk) this.E).K.X0(null, zvj.y0) && v1()) {
            if (y1("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                b0().M.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                R0().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                b0().J.c("Error incrementing retry count. error", e);
            }
        }
    }

    public final void h1(String str, Bundle bundle) {
        K0();
        O0();
        byte[] bArrC = L0().W0(new ruj((umk) this.E, "", str, "dep", 0L, 0L, bundle)).c();
        b0().R.a(((umk) this.E).Q.b(str), Integer.valueOf(bArrC.length), "Saving default event parameters, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrC);
        try {
            if (R0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                b0().J.c("Failed to insert default event parameters (got -1). appId", qgk.Q0(str));
            }
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str), e, "Error storing default event parameters. appId");
        }
    }

    public final void i1(String str, b0 b0Var, String str2, Map map, int i) {
        K0();
        O0();
        dgj.v(b0Var);
        dgj.s(str);
        i4l.a();
        umk umkVar = (umk) this.E;
        vqj vqjVar = umkVar.K;
        ql8 ql8Var = umkVar.R;
        if (vqjVar.X0(null, zvj.y0)) {
            K0();
            O0();
            if (v1()) {
                o0l o0lVar = this.F;
                long jA = o0lVar.M.J.a();
                ql8Var.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (Math.abs(jElapsedRealtime - jA) > ((Long) zvj.z.a(null)).longValue()) {
                    o0lVar.M.J.b(jElapsedRealtime);
                    K0();
                    O0();
                    if (v1()) {
                        SQLiteDatabase sQLiteDatabaseR0 = R0();
                        ql8Var.getClass();
                        System.currentTimeMillis();
                        ((Long) zvj.F.a(null)).longValue();
                        vqj.Z0();
                        int iDelete = sQLiteDatabaseR0.delete("upload_queue", "ABS(creation_timestamp - ?) > CAST(? as integer)", new String[0]);
                        if (iDelete > 0) {
                            b0().R.c("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            byte[] bArrC = b0Var.c();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", bArrC);
            contentValues.put("upload_uri", str2);
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            if (size > 0) {
                sb.append((CharSequence) arrayList.get(0));
                int i2 = 1;
                while (i2 < size) {
                    sb.append((CharSequence) "\r\n");
                    Object obj = arrayList.get(i2);
                    i2++;
                    sb.append((CharSequence) obj);
                }
            }
            contentValues.put("upload_headers", sb.toString());
            contentValues.put("upload_type", Integer.valueOf(fsh.h(i)));
            ql8Var.getClass();
            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry_count", (Integer) 0);
            try {
                if (R0().insert("upload_queue", null, contentValues) == -1) {
                    b0().J.c("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
                }
            } catch (SQLiteException e) {
                b0().J.a(str, e, "Error storing MeasurementBatch to upload_queue. appId");
            }
        }
    }

    public final void j1(String str, Long l, long j, x xVar) {
        K0();
        O0();
        dgj.v(xVar);
        dgj.s(str);
        byte[] bArrC = xVar.c();
        b0().R.a(((umk) this.E).Q.b(str), Integer.valueOf(bArrC.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrC);
        try {
            if (R0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                b0().J.c("Failed to insert complex main event (got -1). appId", qgk.Q0(str));
            }
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str), e, "Error storing complex main event. appId");
        }
    }

    public final void k1(String str, String str2) {
        dgj.s(str);
        dgj.s(str2);
        K0();
        O0();
        try {
            R0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            b0().J.d("Error deleting conditional property", qgk.Q0(str), ((umk) this.E).Q.g(str2), e);
        }
    }

    public final void l1(String str, fvj fvjVar) {
        dgj.v(fvjVar);
        K0();
        O0();
        ContentValues contentValues = new ContentValues();
        String str2 = fvjVar.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", fvjVar.b);
        contentValues.put("lifetime_count", Long.valueOf(fvjVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(fvjVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(fvjVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(fvjVar.g));
        contentValues.put("last_bundled_day", fvjVar.h);
        contentValues.put("last_sampled_complex_event_id", fvjVar.i);
        contentValues.put("last_sampling_rate", fvjVar.j);
        contentValues.put("current_session_count", Long.valueOf(fvjVar.e));
        Boolean bool = fvjVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (R0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                b0().J.c("Failed to insert/update event aggregates (got -1). appId", qgk.Q0(str2));
            }
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str2), e, "Error storing event aggregates. appId");
        }
    }

    public final void m1(String str, qrk qrkVar) {
        dgj.v(str);
        K0();
        O0();
        B1(str, K1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", qrkVar.o());
        d1(contentValues);
    }

    public final void n1(String str, f0l f0lVar) {
        K0();
        O0();
        dgj.s(str);
        ((umk) this.E).R.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = f0lVar.F;
        if (j < jCurrentTimeMillis - vqj.Z0() || j > vqj.Z0() + jCurrentTimeMillis) {
            b0().M.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", qgk.Q0(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        b0().R.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", f0lVar.E);
        contentValues.put("source", Integer.valueOf(f0lVar.G));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (R0().insert("trigger_uris", null, contentValues) == -1) {
                b0().J.c("Failed to insert trigger URI (got -1). appId", qgk.Q0(str));
            }
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str), e, "Error storing trigger URI. appId");
        }
    }

    public final void o1(List list) {
        K0();
        O0();
        dgj.v(list);
        if (((ArrayList) list).size() == 0) {
            sz6.p("Given Integer is zero");
            return;
        }
        if (v1()) {
            String strJ = ij0.j("(", TextUtils.join(",", list), ")");
            if (y1("SELECT COUNT(1) FROM queue WHERE rowid IN " + strJ + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                b0().M.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                R0().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strJ + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                b0().J.c("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p1(defpackage.mjk r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.p1(mjk, boolean):void");
    }

    public final boolean q1(String str, int i, b bVar) {
        O0();
        K0();
        dgj.s(str);
        dgj.v(bVar);
        if (bVar.w().isEmpty()) {
            b0().M.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", qgk.Q0(str), Integer.valueOf(i), String.valueOf(bVar.C() ? Integer.valueOf(bVar.t()) : null));
            return false;
        }
        byte[] bArrC = bVar.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", bVar.C() ? Integer.valueOf(bVar.t()) : null);
        contentValues.put("event_name", bVar.w());
        contentValues.put("session_scoped", bVar.D() ? Boolean.valueOf(bVar.A()) : null);
        contentValues.put("data", bArrC);
        try {
            if (R0().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            b0().J.c("Failed to insert event filter (got -1). appId", qgk.Q0(str));
            return true;
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str), e, "Error storing event filter. appId");
            return false;
        }
    }

    public final boolean r1(String str, int i, e eVar) {
        O0();
        K0();
        dgj.s(str);
        dgj.v(eVar);
        if (eVar.t().isEmpty()) {
            b0().M.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", qgk.Q0(str), Integer.valueOf(i), String.valueOf(eVar.x() ? Integer.valueOf(eVar.p()) : null));
            return false;
        }
        byte[] bArrC = eVar.c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", eVar.x() ? Integer.valueOf(eVar.p()) : null);
        contentValues.put("property_name", eVar.t());
        contentValues.put("session_scoped", eVar.y() ? Boolean.valueOf(eVar.w()) : null);
        contentValues.put("data", bArrC);
        try {
            if (R0().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            b0().J.c("Failed to insert property filter (got -1). appId", qgk.Q0(str));
            return false;
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str), e, "Error storing property filter. appId");
            return false;
        }
    }

    public final boolean s1(kqj kqjVar) {
        K0();
        O0();
        String str = kqjVar.E;
        dgj.v(str);
        if (H1(str, kqjVar.G.F) == null && y1("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", kqjVar.F);
        contentValues.put("name", kqjVar.G.F);
        Object objZza = kqjVar.G.zza();
        dgj.v(objZza);
        e1(contentValues, objZza);
        contentValues.put("active", Boolean.valueOf(kqjVar.I));
        contentValues.put("trigger_event_name", kqjVar.J);
        contentValues.put("trigger_timeout", Long.valueOf(kqjVar.L));
        J0();
        contentValues.put("timed_out_event", h1l.A1(kqjVar.K));
        contentValues.put("creation_timestamp", Long.valueOf(kqjVar.H));
        J0();
        contentValues.put("triggered_event", h1l.A1(kqjVar.M));
        contentValues.put("triggered_timestamp", Long.valueOf(kqjVar.G.G));
        contentValues.put("time_to_live", Long.valueOf(kqjVar.N));
        J0();
        contentValues.put("expired_event", h1l.A1(kqjVar.O));
        try {
            if (R0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            b0().J.c("Failed to insert/update conditional user property (got -1)", qgk.Q0(str));
            return true;
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str), e, "Error storing conditional user property");
            return true;
        }
    }

    public final boolean t1(ruj rujVar, long j, boolean z) {
        K0();
        O0();
        String str = rujVar.a;
        dgj.s(str);
        byte[] bArrC = L0().W0(rujVar).c();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("name", rujVar.b);
        contentValues.put("timestamp", Long.valueOf(rujVar.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", bArrC);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (R0().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            b0().J.c("Failed to insert raw event (got -1). appId", qgk.Q0(str));
            return false;
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str), e, "Error storing raw event. appId");
            return false;
        }
    }

    public final boolean u1(f1l f1lVar) {
        String str = f1lVar.b;
        K0();
        O0();
        String str2 = f1lVar.a;
        String str3 = f1lVar.c;
        if (H1(str2, str3) == null) {
            if (h1l.R1(str3)) {
                if (y1("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(((umk) this.E).K.R0(str2, zvj.I), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3) && y1("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(f1lVar.d));
        e1(contentValues, f1lVar.e);
        try {
            if (R0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            b0().J.c("Failed to insert/update user property (got -1). appId", qgk.Q0(str2));
            return true;
        } catch (SQLiteException e) {
            b0().J.a(qgk.Q0(str2), e, "Error storing user property. appId");
            return true;
        }
    }

    public final boolean v1() {
        return ((umk) this.E).E.getDatabasePath("google_app_measurement.db").exists();
    }

    public final String w1() {
        ((umk) this.E).R.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return ij0.l("app_id=? AND (", "(upload_type = " + fsh.h(2) + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") <= CAST(" + ((Long) zvj.F.a(null)).longValue() + " AS INTEGER)))", " OR", "(upload_type != " + fsh.h(2) + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") <= CAST(" + vqj.Z0() + " AS INTEGER)))", ")");
    }

    public final long x1(String str) {
        long jV0;
        dgj.s(str);
        dgj.s("first_open_count");
        K0();
        O0();
        SQLiteDatabase sQLiteDatabaseR0 = R0();
        sQLiteDatabaseR0.beginTransaction();
        long j = 0;
        try {
            try {
                jV0 = V0("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
            } catch (SQLiteException e) {
                e = e;
            }
            if (jV0 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (sQLiteDatabaseR0.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    b0().J.a(qgk.Q0(str), "first_open_count", "Failed to insert column (got -1). appId");
                    return -1L;
                }
                jV0 = 0;
                b0().J.d("Error inserting column. appId", qgk.Q0(str), "first_open_count", e);
                return j;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str);
                contentValues2.put("first_open_count", Long.valueOf(1 + jV0));
                if (sQLiteDatabaseR0.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                    b0().J.a(qgk.Q0(str), "first_open_count", "Failed to update column (got 0). appId");
                    return -1L;
                }
                sQLiteDatabaseR0.setTransactionSuccessful();
                return jV0;
            } catch (SQLiteException e2) {
                e = e2;
                j = jV0;
            }
        } finally {
            sQLiteDatabaseR0.endTransaction();
        }
    }

    public final long y1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = R0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                b0().J.a(str, e, "Database error");
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        b0().J.c("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List z1(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrj.z1(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }
}
