package defpackage;

import android.content.Context;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregation;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItemAggregationBucketBy;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;
import com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oi8 {
    public final Context a;
    public final zy7 b;

    public oi8(Context context) {
        dg8 dg8Var = new dg8(2, context);
        this.a = context;
        this.b = dg8Var;
    }

    public static ls a(HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem healthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem) {
        switch (ii8.b[healthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem.ordinal()]) {
            case 1:
                return ls.E;
            case 2:
                return ls.F;
            case 3:
                return ls.G;
            case 4:
                return ls.H;
            case 5:
                return ls.I;
            case 6:
                return ls.J;
            default:
                mr9.b();
                return null;
        }
    }

    public static HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem b(hs hsVar, Instant instant, Instant instant2, sk8 sk8Var, List list) {
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType;
        OffsetDateTime offsetDateTimeOfInstant = OffsetDateTime.ofInstant(instant, ZoneId.systemDefault());
        OffsetDateTime offsetDateTimeOfInstant2 = OffsetDateTime.ofInstant(instant2, ZoneId.systemDefault());
        ArrayList<r7i> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem healthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem = (HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem) it.next();
            ms msVar = (ms) sk8Var.h().get(a(healthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem));
            cpc cpcVarA = msVar != null ? msVar.a(hsVar) : null;
            r7i r7iVar = cpcVarA != null ? new r7i(Double.valueOf(((Number) cpcVarA.E).doubleValue()), (String) cpcVarA.F, healthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem) : null;
            if (r7iVar != null) {
                arrayList.add(r7iVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String str = (String) ((r7i) w44.L0(arrayList)).F;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        for (r7i r7iVar2 : arrayList) {
            double dDoubleValue = ((Number) r7iVar2.E).doubleValue();
            switch (ii8.b[((HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem) r7iVar2.G).ordinal()]) {
                case 1:
                    healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType.SUM;
                    break;
                case 2:
                    healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType.AVERAGE;
                    break;
                case 3:
                    healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType.MIN;
                    break;
                case 4:
                    healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType.MAX;
                    break;
                case 5:
                    healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType.COUNT;
                    break;
                case 6:
                    healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType = HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType.DURATION;
                    break;
                default:
                    mr9.b();
                    return null;
            }
            arrayList2.add(new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItem(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItemValuesItemAggregationType, dDoubleValue));
        }
        offsetDateTimeOfInstant.getClass();
        offsetDateTimeOfInstant2.getClass();
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem(offsetDateTimeOfInstant2, offsetDateTimeOfInstant, str, arrayList2);
    }

    public static HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem c(String str, HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType, String str2) {
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem(null, new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType, str2), null, null, str, null);
    }

    public static List j(sk8 sk8Var, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ms msVar = (ms) sk8Var.h().get(a((HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem) it.next()));
            vr vrVarB = msVar != null ? msVar.b() : null;
            if (vrVarB != null) {
                arrayList.add(vrVarB);
            }
        }
        return w44.p1(w44.s1(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(defpackage.bh8 r5, defpackage.sk8 r6, defpackage.bqh r7, int r8, java.util.List r9, defpackage.vp4 r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.ji8
            if (r0 == 0) goto L13
            r0 = r10
            ji8 r0 = (defpackage.ji8) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            ji8 r0 = new ji8
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r4 = r0.G
            int r10 = r0.I
            r1 = 1
            if (r10 == 0) goto L33
            if (r10 != r1) goto L2c
            java.util.List r5 = r0.F
            r9 = r5
            java.util.List r9 = (java.util.List) r9
            sk8 r6 = r0.E
            defpackage.sf5.h0(r4)
            goto L5f
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L33:
            defpackage.sf5.h0(r4)
            java.util.List r4 = j(r6, r9)
            lr r10 = new lr
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r4 = defpackage.w44.t1(r4)
            long r2 = (long) r8
            java.time.Duration r8 = java.time.Duration.ofMinutes(r2)
            r8.getClass()
            r10.<init>(r4, r7, r8)
            r0.E = r6
            r4 = r9
            java.util.List r4 = (java.util.List) r4
            r0.F = r4
            r0.I = r1
            java.lang.Object r4 = r5.e(r10, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L5f
            return r5
        L5f:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L6c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L8e
            java.lang.Object r7 = r4.next()
            is r7 = (defpackage.is) r7
            hs r8 = r7.b()
            java.time.Instant r10 = r7.c()
            java.time.Instant r7 = r7.a()
            com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem r7 = b(r8, r10, r7, r6, r9)
            if (r7 == 0) goto L6c
            r5.add(r7)
            goto L6c
        L8e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi8.d(bh8, sk8, bqh, int, java.util.List, vp4):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(defpackage.bh8 r5, defpackage.sk8 r6, defpackage.bqh r7, int r8, java.util.List r9, defpackage.vp4 r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.ki8
            if (r0 == 0) goto L13
            r0 = r10
            ki8 r0 = (defpackage.ki8) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            ki8 r0 = new ki8
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r4 = r0.G
            int r10 = r0.I
            r1 = 1
            if (r10 == 0) goto L33
            if (r10 != r1) goto L2c
            java.util.List r5 = r0.F
            r9 = r5
            java.util.List r9 = (java.util.List) r9
            sk8 r6 = r0.E
            defpackage.sf5.h0(r4)
            goto L5e
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L33:
            defpackage.sf5.h0(r4)
            java.util.List r4 = j(r6, r9)
            mr r10 = new mr
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r4 = defpackage.w44.t1(r4)
            java.time.Period r8 = java.time.Period.ofDays(r8)
            r8.getClass()
            r10.<init>(r4, r7, r8)
            r0.E = r6
            r4 = r9
            java.util.List r4 = (java.util.List) r4
            r0.F = r4
            r0.I = r1
            java.lang.Object r4 = r5.b(r10, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L5e
            return r5
        L5e:
            java.util.List r4 = (java.util.List) r4
            java.time.ZoneId r5 = java.time.ZoneId.systemDefault()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L6f:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La7
            java.lang.Object r8 = r4.next()
            ks r8 = (defpackage.ks) r8
            java.time.LocalDateTime r10 = r8.c()
            java.time.ZonedDateTime r10 = r10.atZone(r5)
            java.time.Instant r10 = r10.toInstant()
            java.time.LocalDateTime r0 = r8.a()
            java.time.ZonedDateTime r0 = r0.atZone(r5)
            java.time.Instant r0 = r0.toInstant()
            hs r8 = r8.b()
            r10.getClass()
            r0.getClass()
            com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem r8 = b(r8, r10, r0, r6, r9)
            if (r8 == 0) goto L6f
            r7.add(r8)
            goto L6f
        La7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi8.e(bh8, sk8, bqh, int, java.util.List, vp4):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.bh8 r5, defpackage.sk8 r6, defpackage.bqh r7, java.util.List r8, defpackage.vp4 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.li8
            if (r0 == 0) goto L13
            r0 = r9
            li8 r0 = (defpackage.li8) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            li8 r0 = new li8
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r4 = r0.H
            int r9 = r0.J
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L35
            if (r9 != r2) goto L2f
            java.util.List r5 = r0.G
            r8 = r5
            java.util.List r8 = (java.util.List) r8
            bqh r7 = r0.F
            sk8 r6 = r0.E
            defpackage.sf5.h0(r4)
            goto L5b
        L2f:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r1
        L35:
            defpackage.sf5.h0(r4)
            java.util.List r4 = j(r6, r8)
            xr r9 = new xr
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r4 = defpackage.w44.t1(r4)
            r9.<init>(r4, r7)
            r0.E = r6
            r0.F = r7
            r4 = r8
            java.util.List r4 = (java.util.List) r4
            r0.G = r4
            r0.J = r2
            java.lang.Object r4 = r5.a(r9, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L5b
            return r5
        L5b:
            hs r4 = (defpackage.hs) r4
            java.time.ZoneId r5 = java.time.ZoneId.systemDefault()
            java.time.LocalDateTime r9 = r7.b()
            if (r9 == 0) goto L92
            java.time.ZonedDateTime r9 = r9.atZone(r5)
            if (r9 == 0) goto L92
            java.time.Instant r9 = r9.toInstant()
            if (r9 == 0) goto L92
            java.time.LocalDateTime r7 = r7.a()
            java.time.ZonedDateTime r5 = r7.atZone(r5)
            if (r5 == 0) goto L8c
            java.time.Instant r5 = r5.toInstant()
            if (r5 == 0) goto L8c
            com.anthropic.claude.tool.model.HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemAggregationsItem r4 = b(r4, r9, r5, r6, r8)
            java.util.List r4 = defpackage.x44.Y(r4)
            return r4
        L8c:
            java.lang.String r4 = "End time should not be null"
            defpackage.sz6.j(r4)
            return r1
        L92:
            java.lang.String r4 = "Start time should not be null"
            defpackage.sz6.j(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi8.f(bh8, sk8, bqh, java.util.List, vp4):java.lang.Object");
    }

    public final Object g(bh8 bh8Var, sk8 sk8Var, bqh bqhVar, HealthConnectQueryV0InputQueriesItemAggregation healthConnectQueryV0InputQueriesItemAggregation, mi8 mi8Var) {
        HealthConnectQueryV0InputQueriesItemAggregationBucketBy bucket_by = healthConnectQueryV0InputQueriesItemAggregation.getBucket_by();
        if (bucket_by == null) {
            bucket_by = HealthConnectQueryV0InputQueriesItemAggregationBucketBy.NONE;
        }
        List<HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem> aggregation_types = healthConnectQueryV0InputQueriesItemAggregation.getAggregation_types();
        if (aggregation_types == null) {
            aggregation_types = lm6.E;
        }
        List<HealthConnectQueryV0InputQueriesItemAggregationAggregationTypesItem> list = aggregation_types;
        int i = ii8.a[bucket_by.ordinal()];
        if (i == 1) {
            return f(bh8Var, sk8Var, bqhVar, list, mi8Var);
        }
        if (i == 2) {
            Integer bucket_duration_minutes = healthConnectQueryV0InputQueriesItemAggregation.getBucket_duration_minutes();
            return d(bh8Var, sk8Var, bqhVar, bucket_duration_minutes != null ? bucket_duration_minutes.intValue() : 60, list, mi8Var);
        }
        if (i == 3) {
            Integer bucket_period_days = healthConnectQueryV0InputQueriesItemAggregation.getBucket_period_days();
            return e(bh8Var, sk8Var, bqhVar, bucket_period_days != null ? bucket_period_days.intValue() : 1, list, mi8Var);
        }
        mr9.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e8  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.time.LocalDateTime, java.time.chrono.ChronoLocalDateTime] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.time.LocalDateTime] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItem r22, defpackage.vp4 r23) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi8.h(com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItem, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable i(defpackage.bh8 r10, defpackage.sk8 r11, defpackage.bqh r12, java.lang.Integer r13, java.lang.String r14, defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi8.i(bh8, sk8, bqh, java.lang.Integer, java.lang.String, vp4):java.io.Serializable");
    }
}
