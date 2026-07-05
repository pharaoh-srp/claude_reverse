package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.CalendarContract;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.db.ClaudeDatabase;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItem;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemAvailability;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrence;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemStatus;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemAvailability;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrence;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.text.Bidi;
import java.time.OffsetDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class el5 implements fe7, frc, da4, kw9 {
    public static final byte[] J = new byte[0];
    public Object E;
    public Object F;
    public final Object G;
    public Object H;
    public Object I;

    public el5(zb0 zb0Var, tkh tkhVar, List list, cz5 cz5Var, wt7 wt7Var) {
        int i;
        String str;
        int i2;
        List list2;
        zb0 zb0Var2 = zb0Var;
        tkh tkhVar2 = tkhVar;
        this.E = zb0Var2;
        this.F = list;
        final int i3 = 0;
        zy7 zy7Var = new zy7(this) { // from class: rtb
            public final /* synthetic */ el5 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i4 = i3;
                float f = MTTypesetterKt.kLineSkipLimitMultiplier;
                Object obj = null;
                int i5 = 1;
                el5 el5Var = this.F;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) el5Var.I;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float f2 = ((erc) obj2).a.f();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float f3 = ((erc) obj3).a.f();
                                    if (Float.compare(f2, f3) < 0) {
                                        obj2 = obj3;
                                        f2 = f3;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        erc ercVar = (erc) obj;
                        if (ercVar != null) {
                            f = ercVar.a.f();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) el5Var.I;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((erc) obj4).a.M.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((erc) obj5).a.M.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        erc ercVar2 = (erc) obj;
                        if (ercVar2 != null) {
                            f = ercVar2.a.M.c();
                        }
                        return Float.valueOf(f);
                }
            }
        };
        w1a w1aVar = w1a.G;
        this.G = yb5.w(w1aVar, zy7Var);
        final int i4 = 1;
        this.H = yb5.w(w1aVar, new zy7(this) { // from class: rtb
            public final /* synthetic */ el5 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i42 = i4;
                float f = MTTypesetterKt.kLineSkipLimitMultiplier;
                Object obj = null;
                int i5 = 1;
                el5 el5Var = this.F;
                switch (i42) {
                    case 0:
                        ArrayList arrayList = (ArrayList) el5Var.I;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float f2 = ((erc) obj2).a.f();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float f3 = ((erc) obj3).a.f();
                                    if (Float.compare(f2, f3) < 0) {
                                        obj2 = obj3;
                                        f2 = f3;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        erc ercVar = (erc) obj;
                        if (ercVar != null) {
                            f = ercVar.a.f();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) el5Var.I;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((erc) obj4).a.M.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((erc) obj5).a.M.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        erc ercVar2 = (erc) obj;
                        if (ercVar2 != null) {
                            f = ercVar2.a.M.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        jrc jrcVar = tkhVar2.b;
        zb0 zb0Var3 = ac0.a;
        ArrayList arrayList = zb0Var2.H;
        String str2 = zb0Var2.F;
        lm6 lm6Var = lm6.E;
        List listI1 = arrayList != null ? w44.i1(arrayList, new mt7(10)) : lm6Var;
        ArrayList arrayList2 = new ArrayList();
        qo0 qo0Var = new qo0();
        int size = listI1.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            yb0 yb0Var = (yb0) listI1.get(i5);
            yb0 yb0VarA = yb0.a(yb0Var, jrcVar.a((jrc) yb0Var.a), i3, i3, 14);
            Object obj = yb0VarA.a;
            int i7 = yb0VarA.c;
            int i8 = yb0VarA.b;
            while (i6 < i8 && !qo0Var.isEmpty()) {
                yb0 yb0Var2 = (yb0) qo0Var.last();
                List list3 = listI1;
                int i9 = yb0Var2.c;
                lm6 lm6Var2 = lm6Var;
                Object obj2 = yb0Var2.a;
                if (i8 < i9) {
                    arrayList2.add(new yb0(obj2, i6, i8));
                    i6 = i8;
                    listI1 = list3;
                    lm6Var = lm6Var2;
                } else {
                    int i10 = size;
                    arrayList2.add(new yb0(obj2, i6, i9));
                    i6 = yb0Var2.c;
                    while (!qo0Var.isEmpty() && i6 == ((yb0) qo0Var.last()).c) {
                        qo0Var.removeLast();
                    }
                    listI1 = list3;
                    lm6Var = lm6Var2;
                    size = i10;
                }
            }
            List list4 = listI1;
            lm6 lm6Var3 = lm6Var;
            int i11 = size;
            if (i6 < i8) {
                arrayList2.add(new yb0(jrcVar, i6, i8));
                i6 = i8;
            }
            yb0 yb0Var3 = (yb0) qo0Var.k();
            if (yb0Var3 != null) {
                int i12 = yb0Var3.c;
                Object obj3 = yb0Var3.a;
                int i13 = yb0Var3.b;
                if (i13 == i8 && i12 == i7) {
                    qo0Var.removeLast();
                    qo0Var.addLast(new yb0(((jrc) obj3).a((jrc) obj), i8, i7));
                } else if (i13 == i12) {
                    arrayList2.add(new yb0(obj3, i13, i12));
                    qo0Var.removeLast();
                    qo0Var.addLast(new yb0(obj, i8, i7));
                } else {
                    if (i12 < i7) {
                        mr9.y();
                        throw null;
                    }
                    qo0Var.addLast(new yb0(((jrc) obj3).a((jrc) obj), i8, i7));
                }
            } else {
                qo0Var.addLast(new yb0(obj, i8, i7));
            }
            i5++;
            listI1 = list4;
            lm6Var = lm6Var3;
            size = i11;
            i3 = 0;
        }
        lm6 lm6Var4 = lm6Var;
        while (i6 <= str2.length() && !qo0Var.isEmpty()) {
            yb0 yb0Var4 = (yb0) qo0Var.last();
            Object obj4 = yb0Var4.a;
            int i14 = yb0Var4.c;
            arrayList2.add(new yb0(obj4, i6, i14));
            while (!qo0Var.isEmpty() && i14 == ((yb0) qo0Var.last()).c) {
                qo0Var.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str2.length()) {
            arrayList2.add(new yb0(jrcVar, i6, str2.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new yb0(jrcVar, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            yb0 yb0Var5 = (yb0) arrayList2.get(i15);
            int i16 = yb0Var5.b;
            int i17 = yb0Var5.c;
            String strSubstring = i16 != i17 ? str2.substring(i16, i17) : "";
            List listA = ac0.a(zb0Var2, i16, i17, new b8(13));
            zb0 zb0Var4 = new zb0(strSubstring, listA == null ? lm6Var4 : listA);
            jrc jrcVar2 = (jrc) yb0Var5.a;
            if (jrcVar2.b == 0) {
                str = str2;
                i2 = size2;
                jrcVar2 = new jrc(jrcVar2.a, jrcVar.b, jrcVar2.c, jrcVar2.d, jrcVar2.e, jrcVar2.f, jrcVar2.g, jrcVar2.h, jrcVar2.i);
            } else {
                str = str2;
                i2 = size2;
            }
            tkh tkhVar3 = new tkh(tkhVar2.a, jrcVar.a(jrcVar2));
            List list5 = zb0Var4.E;
            List list6 = list5 == null ? lm6Var4 : list5;
            List list7 = (List) this.F;
            ArrayList arrayList4 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i18 = 0;
            while (i18 < size3) {
                yb0 yb0Var6 = (yb0) list7.get(i18);
                int i19 = yb0Var6.b;
                jrc jrcVar3 = jrcVar;
                int i20 = yb0Var6.c;
                if (ac0.b(i16, i17, i19, i20)) {
                    if (i16 > i19 || i20 > i17) {
                        c39.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list7;
                    arrayList4.add(new yb0(yb0Var6.a, i19 - i16, i20 - i16));
                } else {
                    list2 = list7;
                }
                i18++;
                list7 = list2;
                jrcVar = jrcVar3;
            }
            arrayList3.add(new erc(new b40(strSubstring, tkhVar3, list6, arrayList4, wt7Var, cz5Var), i16, i17));
            i15++;
            zb0Var2 = zb0Var;
            tkhVar2 = tkhVar;
            str2 = str;
            size2 = i2;
        }
        this.I = arrayList3;
    }

    public static ContentValues t(EventUpdateV0InputEventUpdatesItem eventUpdateV0InputEventUpdatesItem) {
        String rrule;
        int i;
        ContentValues contentValues = new ContentValues();
        String title = eventUpdateV0InputEventUpdatesItem.getTitle();
        if (title != null) {
            contentValues.put("title", title);
        }
        OffsetDateTime start_time = eventUpdateV0InputEventUpdatesItem.getStart_time();
        if (start_time != null) {
            contentValues.put("dtstart", Long.valueOf(start_time.toInstant().toEpochMilli()));
        }
        OffsetDateTime end_time = eventUpdateV0InputEventUpdatesItem.getEnd_time();
        if (end_time != null) {
            contentValues.put("dtend", Long.valueOf(end_time.toInstant().toEpochMilli()));
        }
        Boolean all_day = eventUpdateV0InputEventUpdatesItem.getAll_day();
        if (all_day != null) {
            contentValues.put("allDay", Integer.valueOf(all_day.booleanValue() ? 1 : 0));
        }
        String location = eventUpdateV0InputEventUpdatesItem.getLocation();
        if (location != null) {
            contentValues.put("eventLocation", location);
        }
        String event_description = eventUpdateV0InputEventUpdatesItem.getEvent_description();
        if (event_description != null) {
            contentValues.put("description", event_description);
        }
        EventUpdateV0InputEventUpdatesItemStatus status = eventUpdateV0InputEventUpdatesItem.getStatus();
        int i2 = 0;
        if (status != null) {
            int i3 = yx6.c[status.ordinal()];
            if (i3 == 1) {
                i = 1;
            } else if (i3 == 2) {
                i = 0;
            } else {
                if (i3 != 3) {
                    mr9.b();
                    return null;
                }
                i = 2;
            }
            contentValues.put("eventStatus", Integer.valueOf(i));
        }
        EventUpdateV0InputEventUpdatesItemAvailability availability = eventUpdateV0InputEventUpdatesItem.getAvailability();
        if (availability != null) {
            int i4 = yx6.d[availability.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    i2 = 1;
                } else {
                    if (i4 != 3) {
                        mr9.b();
                        return null;
                    }
                    i2 = 2;
                }
            }
            contentValues.put("availability", Integer.valueOf(i2));
        }
        EventUpdateV0InputEventUpdatesItemRecurrence recurrence = eventUpdateV0InputEventUpdatesItem.getRecurrence();
        if (recurrence != null && (rrule = recurrence.getRrule()) != null) {
            contentValues.put("rrule", rrule);
        }
        return contentValues;
    }

    public static el5 u(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        el5 el5Var = new el5(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) el5Var.H)) {
            try {
                ((ArrayDeque) el5Var.H).clear();
                String string = ((SharedPreferences) el5Var.E).getString((String) el5Var.F, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) el5Var.G)) {
                    String[] strArrSplit = string.split((String) el5Var.G, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) el5Var.H).add(str);
                        }
                    }
                    return el5Var;
                }
                return el5Var;
            } finally {
            }
        }
    }

    public int A(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.F).get(i - 1)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.pxi B(java.lang.String r8) {
        /*
            r7 = this;
            r8.getClass()
            java.lang.Long r0 = r7.G(r8)
            pxi r1 = new pxi
            java.lang.Object r2 = r7.F
            bt9 r2 = (defpackage.bt9) r2
            if (r2 == 0) goto L17
            boolean r3 = r2 instanceof defpackage.nph
            if (r3 != 0) goto L15
            r3 = 4
            goto L18
        L15:
            r3 = 2
            goto L18
        L17:
            r3 = 1
        L18:
            if (r0 != 0) goto L4c
            if (r2 != 0) goto L1f
            y4c r7 = defpackage.y4c.E
            goto L4d
        L1f:
            java.lang.Long r2 = r7.E(r8)
            y4c r4 = defpackage.y4c.I
            if (r2 == 0) goto L4a
            long r5 = r2.longValue()
            java.lang.String r8 = r7.H(r8)
            if (r8 != 0) goto L34
            y4c r7 = defpackage.y4c.H
            goto L4d
        L34:
            java.lang.Object r2 = r7.G
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r2 = r2.get(r8)
            if (r2 != 0) goto L41
            y4c r7 = defpackage.y4c.F
            goto L4d
        L41:
            c99 r7 = r7.F(r5, r8)
            if (r7 != 0) goto L4a
            y4c r7 = defpackage.y4c.G
            goto L4d
        L4a:
            r7 = r4
            goto L4d
        L4c:
            r7 = 0
        L4d:
            r1.<init>(r0, r3, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el5.B(java.lang.String):pxi");
    }

    public int C(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.E).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((x44.z(cCharAt, FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) < 0 || x44.z(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void D() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.I;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.G;
        while (linkedHashMap2.entrySet().size() > 4) {
            Set setEntrySet = linkedHashMap2.entrySet();
            Set setEntrySet2 = linkedHashMap2.entrySet();
            setEntrySet2.getClass();
            setEntrySet.remove(w44.K0(setEntrySet2));
        }
        while (linkedHashMap.entrySet().size() > 4) {
            Set setKeySet = linkedHashMap.keySet();
            setKeySet.getClass();
            linkedHashMap.remove(w44.K0(setKeySet));
        }
    }

    public Long E(String str) {
        Long l = (Long) ((LinkedHashMap) this.I).get(str);
        if (l == null) {
            dch.H((h99) this.H, 4, g99.F, new jp5(str, 1), null, false, 56);
        }
        return l;
    }

    public c99 F(long j, String str) {
        c99 c99Var;
        bt9 bt9Var = (bt9) this.F;
        if (bt9Var == null || (c99Var = (c99) ((LinkedHashMap) this.G).get(str)) == null || !bt9Var.d(new bfd(c99Var.b, c99Var.c, Long.valueOf(j)))) {
            return null;
        }
        return c99Var;
    }

    public Long G(String str) {
        str.getClass();
        D();
        Long lE = E(str);
        if (lE != null) {
            long jLongValue = lE.longValue();
            String strH = H(str);
            c99 c99VarF = strH != null ? F(jLongValue, strH) : null;
            if (c99VarF != null) {
                long j = jLongValue - c99VarF.c;
                if (j > 0) {
                    return Long.valueOf(j);
                }
                dch.H((h99) this.H, 4, g99.F, new rb1(str, 14), null, false, 56);
            }
        }
        return null;
    }

    public String H(String str) {
        Object objO0;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.I;
        Set setKeySet = linkedHashMap.keySet();
        setKeySet.getClass();
        int iP0 = w44.P0(setKeySet, str);
        Set setKeySet2 = linkedHashMap.keySet();
        setKeySet2.getClass();
        Set set = setKeySet2;
        int i = iP0 - 1;
        if (set instanceof List) {
            objO0 = w44.O0(i, (List) set);
        } else if (i < 0) {
            objO0 = null;
        } else {
            int i2 = 0;
            for (Object obj : set) {
                int i3 = i2 + 1;
                if (i == i2) {
                    objO0 = obj;
                    break;
                }
                i2 = i3;
            }
            objO0 = null;
        }
        return (String) objO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(defpackage.vp4 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = r9.F
            v84 r0 = (defpackage.v84) r0
            boolean r1 = r10 instanceof defpackage.gze
            if (r1 == 0) goto L17
            r1 = r10
            gze r1 = (defpackage.gze) r1
            int r2 = r1.I
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.I = r2
            goto L1c
        L17:
            gze r1 = new gze
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.G
            int r2 = r1.I
            r3 = 2
            r4 = 1
            iei r5 = defpackage.iei.a
            r6 = 0
            m45 r7 = defpackage.m45.E
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L35
            hxb r9 = r1.E
            defpackage.sf5.h0(r10)     // Catch: java.lang.Throwable -> L33
            goto L78
        L33:
            r10 = move-exception
            goto L83
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r6
        L3b:
            int r2 = r1.F
            hxb r4 = r1.E
            defpackage.sf5.h0(r10)
            r10 = r4
            goto L60
        L44:
            defpackage.sf5.h0(r10)
            boolean r10 = r0.Z()
            if (r10 == 0) goto L4e
            return r5
        L4e:
            java.lang.Object r10 = r9.E
            jxb r10 = (defpackage.jxb) r10
            r1.E = r10
            r2 = 0
            r1.F = r2
            r1.I = r4
            java.lang.Object r4 = r10.c(r1)
            if (r4 != r7) goto L60
            goto L76
        L60:
            boolean r4 = r0.Z()     // Catch: java.lang.Throwable -> L7f
            if (r4 == 0) goto L6a
            r10.d(r6)
            return r5
        L6a:
            r1.E = r10     // Catch: java.lang.Throwable -> L7f
            r1.F = r2     // Catch: java.lang.Throwable -> L7f
            r1.I = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r9 = r9.v(r1)     // Catch: java.lang.Throwable -> L7f
            if (r9 != r7) goto L77
        L76:
            return r7
        L77:
            r9 = r10
        L78:
            r0.c0(r5)     // Catch: java.lang.Throwable -> L33
            r9.d(r6)
            return r5
        L7f:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L83:
            r9.d(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el5.I(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.c79 J(float r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.F
            qv1 r0 = (defpackage.qv1) r0
            r1 = 0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto Le
            c79 r10 = r0.a()
            goto L7d
        Le:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            java.lang.Object r2 = r9.G
            qv1 r2 = (defpackage.qv1) r2
            if (r1 != 0) goto L1d
            c79 r10 = r2.a()
            goto L7d
        L1d:
            boolean r1 = r0.b()
            if (r1 == 0) goto L66
            boolean r1 = r2.b()
            if (r1 != 0) goto L2a
            goto L66
        L2a:
            java.lang.Object r1 = r9.I
            a5h r1 = (defpackage.a5h) r1
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r1.d
            c79 r3 = r0.a()
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r9.I
            a5h r1 = (defpackage.a5h) r1
            r1.getClass()
            java.lang.Object r1 = r1.c
            c79 r3 = r2.a()
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L66
        L4f:
            a5h r3 = new a5h
            java.lang.Object r1 = r9.E
            r4 = r1
            kl7 r4 = (defpackage.kl7) r4
            d9i r5 = defpackage.dgj.e
            c79 r6 = r0.a()
            c79 r7 = r2.a()
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r9.I = r3
        L66:
            java.lang.Object r0 = r9.I
            a5h r0 = (defpackage.a5h) r0
            if (r0 == 0) goto L7b
            long r1 = r0.b()
            float r1 = (float) r1
            float r1 = r1 * r10
            long r1 = (long) r1
            java.lang.Object r10 = r0.f(r1)
            c79 r10 = (defpackage.c79) r10
            if (r10 != 0) goto L7d
        L7b:
            c79 r10 = defpackage.dgj.d
        L7d:
            r9.H = r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el5.J(float):c79");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object K(defpackage.pz7 r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.lq4
            if (r0 == 0) goto L13
            r0 = r9
            lq4 r0 = (defpackage.lq4) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            lq4 r0 = new lq4
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            hxb r7 = r0.F
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L2d
            goto L6a
        L2d:
            r8 = move-exception
            goto L72
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r4
        L35:
            hxb r8 = r0.F
            xzg r1 = r0.E
            pz7 r1 = (defpackage.pz7) r1
            defpackage.sf5.h0(r9)
            goto L58
        L3f:
            defpackage.sf5.h0(r9)
            java.lang.Object r9 = r7.G
            jxb r9 = (defpackage.jxb) r9
            r1 = r8
            xzg r1 = (defpackage.xzg) r1
            r0.E = r1
            r0.F = r9
            r0.I = r3
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r5) goto L56
            goto L68
        L56:
            r1 = r8
            r8 = r9
        L58:
            java.lang.Object r7 = r7.H     // Catch: java.lang.Throwable -> L6e
            kq4 r7 = (defpackage.kq4) r7     // Catch: java.lang.Throwable -> L6e
            r0.E = r4     // Catch: java.lang.Throwable -> L6e
            r0.F = r8     // Catch: java.lang.Throwable -> L6e
            r0.I = r2     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r9 = r1.invoke(r7, r0)     // Catch: java.lang.Throwable -> L6e
            if (r9 != r5) goto L69
        L68:
            return r5
        L69:
            r7 = r8
        L6a:
            r7.d(r4)
            return r9
        L6e:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L72:
            r7.d(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el5.K(pz7, vp4):java.lang.Object");
    }

    @Override // defpackage.da4
    public Object a(Class cls) {
        if (!((Set) this.E).contains(qzd.a(cls))) {
            mr9.r(cls, ".", "Attempting to request an undeclared dependency ");
            return null;
        }
        Object objA = ((da4) this.I).a(cls);
        if (!cls.equals(uwd.class)) {
            return objA;
        }
        return new ere();
    }

    @Override // defpackage.kw9
    public boolean b() {
        return ((vxi) this.I) != null;
    }

    @Override // defpackage.frc
    public boolean c() {
        ArrayList arrayList = (ArrayList) this.I;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((erc) arrayList.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.da4
    public Set d(qzd qzdVar) {
        if (((Set) this.G).contains(qzdVar)) {
            return ((da4) this.I).d(qzdVar);
        }
        mr9.r(qzdVar, ">.", "Attempting to request an undeclared dependency Set<");
        return null;
    }

    @Override // defpackage.da4
    public jvd e(Class cls) {
        return h(qzd.a(cls));
    }

    @Override // defpackage.frc
    public float f() {
        return ((Number) ((kw9) this.G).getValue()).floatValue();
    }

    @Override // defpackage.da4
    public jvd g(qzd qzdVar) {
        if (((Set) this.H).contains(qzdVar)) {
            return ((da4) this.I).g(qzdVar);
        }
        mr9.r(qzdVar, ">>.", "Attempting to request an undeclared dependency Provider<Set<");
        return null;
    }

    @Override // defpackage.ivd
    public Object get() {
        return new gt5((Executor) ((ivd) this.E).get(), (jjb) ((ivd) this.F).get(), (fj0) ((w3c) this.G).get(), (sze) ((ivd) this.H).get(), (sze) ((ivd) this.I).get());
    }

    @Override // defpackage.kw9
    public Object getValue() {
        vxi vxiVar = (vxi) this.I;
        if (vxiVar != null) {
            return vxiVar;
        }
        dpf dpfVar = new dpf(((mpa) this.F).F.f(), (zxi) ((q59) this.G).a(), ((mpa) this.H).F.d());
        pl9 pl9Var = (pl9) this.E;
        pl9Var.getClass();
        String strD = pl9Var.d();
        if (strD == null) {
            sz6.p("Local and anonymous classes can not be ViewModels");
            return null;
        }
        vxi vxiVarL = dpfVar.L(pl9Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strD));
        this.I = vxiVarL;
        return vxiVarL;
    }

    @Override // defpackage.da4
    public jvd h(qzd qzdVar) {
        if (((Set) this.F).contains(qzdVar)) {
            return ((da4) this.I).h(qzdVar);
        }
        mr9.r(qzdVar, ">.", "Attempting to request an undeclared dependency Provider<");
        return null;
    }

    @Override // defpackage.da4
    public Object i(qzd qzdVar) {
        if (((Set) this.E).contains(qzdVar)) {
            return ((da4) this.I).i(qzdVar);
        }
        mr9.r(qzdVar, ".", "Attempting to request an undeclared dependency ");
        return null;
    }

    @Override // defpackage.frc
    public float j() {
        return ((Number) ((kw9) this.H).getValue()).floatValue();
    }

    public void k(c70 c70Var, pl9 pl9Var) {
        ((ArrayList) this.F).add(new cpc(c70Var, pl9Var));
    }

    public void l(fh7 fh7Var, pl9 pl9Var) {
        ((ArrayList) this.H).add(new l80(fh7Var, 24, pl9Var));
    }

    public za2 m(la1 la1Var, zy7 zy7Var) {
        int i;
        int i2;
        int i3;
        bae baeVar = new bae();
        baeVar.E = -1;
        synchronized (this.E) {
            Throwable th = (Throwable) this.F;
            if (th != null) {
                la1Var.b(th);
                return pyk.I;
            }
            t11 t11Var = (t11) this.G;
            do {
                i = t11Var.get();
                i2 = i + 1;
            } while (!t11Var.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            baeVar.E = (i2 >>> 27) & 15;
            ((qvb) this.H).a(la1Var);
            if (z && zy7Var != null) {
                try {
                    zy7Var.a();
                } catch (Throwable th2) {
                    synchronized (this.E) {
                        try {
                            if (((Throwable) this.F) == null) {
                                this.F = th2;
                                qvb qvbVar = (qvb) this.H;
                                Object[] objArr = qvbVar.a;
                                int i5 = qvbVar.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((la1) objArr[i6]).b(th2);
                                }
                                ((qvb) this.H).d();
                                t11 t11Var2 = (t11) this.G;
                                do {
                                    i3 = t11Var2.get();
                                } while (!t11Var2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new q28(new ka1(la1Var, this, baeVar, i4));
        }
    }

    public void n(String str, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_id", str);
                contentValues.put("attendeeEmail", str2);
                contentValues.put("attendeeRelationship", (Integer) 1);
                contentValues.put("attendeeType", (Integer) 1);
                contentValues.put("attendeeStatus", (Integer) 3);
                ((Context) this.E).getContentResolver().insert(CalendarContract.Attendees.CONTENT_URI, contentValues);
            }
        }
    }

    public void o(String str, ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cpc cpcVar = (cpc) it.next();
                int iIntValue = ((Number) cpcVar.E).intValue();
                int iIntValue2 = ((Number) cpcVar.F).intValue();
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_id", str);
                contentValues.put("minutes", Integer.valueOf(iIntValue));
                contentValues.put(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, Integer.valueOf(iIntValue2));
                ((Context) this.E).getContentResolver().insert(CalendarContract.Reminders.CONTENT_URI, contentValues);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi p(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.E
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.F
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.G
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.H
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.I
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.A(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.I
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.I = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el5.p(int):java.text.Bidi");
    }

    public void q(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        us8 us8Var = new us8();
        us8Var.h(null, str);
        vs8 vs8VarC = us8Var.c();
        if ("".equals(vs8VarC.f.get(r0.size() - 1))) {
            this.F = vs8VarC;
        } else {
            xh6.k("baseUrl must end in /: ", vs8VarC);
        }
    }

    public qre r() {
        ArrayList arrayList = (ArrayList) this.G;
        if (((vs8) this.F) == null) {
            sz6.j("Base URL required.");
            return null;
        }
        t82 hdcVar = (t82) this.E;
        if (hdcVar == null) {
            hdcVar = new hdc();
        }
        t82 t82Var = hdcVar;
        Executor executor = (Executor) this.I;
        if (executor == null) {
            executor = t4d.a;
        }
        Executor executor2 = executor;
        lja ljaVar = t4d.c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.H);
        List listI = ljaVar.i(executor2);
        arrayList2.addAll(listI);
        List listJ = ljaVar.j();
        int size = listJ.size();
        ArrayList arrayList3 = new ArrayList(arrayList.size() + 1 + size);
        arrayList3.add(new mz1(0));
        arrayList3.addAll(arrayList);
        arrayList3.addAll(listJ);
        return new qre(t82Var, (vs8) this.F, Collections.unmodifiableList(arrayList3), size, Collections.unmodifiableList(arrayList2), listI.size(), executor2);
    }

    public ContentValues s(EventCreateV1InputNewEventsItem eventCreateV1InputNewEventsItem, String str, Boolean bool) {
        String rrule;
        int i;
        mn5 mn5Var = (mn5) this.F;
        ContentValues contentValues = new ContentValues();
        contentValues.put("calendar_id", str);
        contentValues.put("title", eventCreateV1InputNewEventsItem.getTitle());
        contentValues.put("dtstart", Long.valueOf(eventCreateV1InputNewEventsItem.getStart_time().toInstant().toEpochMilli()));
        EventCreateV1InputNewEventsItemRecurrence recurrence = eventCreateV1InputNewEventsItem.getRecurrence();
        int i2 = 0;
        boolean z = (recurrence != null ? recurrence.getRrule() : null) != null;
        Boolean all_day = eventCreateV1InputNewEventsItem.getAll_day();
        Boolean bool2 = Boolean.TRUE;
        int i3 = (x44.r(all_day, bool2) || eventCreateV1InputNewEventsItem.getEnd_time() == null) ? 1 : 0;
        if (z && i3 == 0) {
            OffsetDateTime end_time = eventCreateV1InputNewEventsItem.getEnd_time();
            if (end_time != null) {
                contentValues.put("duration", hjk.f(end_time.toInstant().toEpochMilli() - eventCreateV1InputNewEventsItem.getStart_time().toInstant().toEpochMilli()));
            }
        } else {
            OffsetDateTime end_time2 = eventCreateV1InputNewEventsItem.getEnd_time();
            if (end_time2 != null) {
                contentValues.put("dtend", Long.valueOf(end_time2.toInstant().toEpochMilli()));
            }
        }
        contentValues.put("allDay", Integer.valueOf(i3));
        String location = eventCreateV1InputNewEventsItem.getLocation();
        if (location != null) {
            contentValues.put("eventLocation", location);
        }
        String event_description = eventCreateV1InputNewEventsItem.getEvent_description();
        if (event_description != null) {
            contentValues.put("description", event_description);
        }
        contentValues.put("eventTimezone", mn5Var.g());
        EventCreateV1InputNewEventsItemStatus status = eventCreateV1InputNewEventsItem.getStatus();
        if (status != null) {
            int i4 = yx6.e[status.ordinal()];
            if (i4 == 1) {
                i = 1;
            } else if (i4 == 2) {
                i = 0;
            } else {
                if (i4 != 3) {
                    mr9.b();
                    return null;
                }
                i = 2;
            }
            contentValues.put("eventStatus", Integer.valueOf(i));
        }
        EventCreateV1InputNewEventsItemAvailability availability = eventCreateV1InputNewEventsItem.getAvailability();
        if (availability != null) {
            int i5 = yx6.f[availability.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    i2 = 1;
                } else {
                    if (i5 != 3) {
                        mr9.b();
                        return null;
                    }
                    i2 = 2;
                }
            }
            contentValues.put("availability", Integer.valueOf(i2));
        }
        EventCreateV1InputNewEventsItemRecurrence recurrence2 = eventCreateV1InputNewEventsItem.getRecurrence();
        if (recurrence2 != null && (rrule = recurrence2.getRrule()) != null) {
            contentValues.put("rrule", rrule);
            if (x44.r(bool, bool2)) {
                contentValues.put("_sync_id", String.valueOf(mn5Var.a()));
            }
        }
        return contentValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(defpackage.vp4 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.I
            bi5 r0 = (defpackage.bi5) r0
            boolean r1 = r7 instanceof defpackage.dh5
            if (r1 == 0) goto L17
            r1 = r7
            dh5 r1 = (defpackage.dh5) r1
            int r2 = r1.G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.G = r2
            goto L1c
        L17:
            dh5 r1 = new dh5
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.E
            int r2 = r1.G
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            defpackage.sf5.h0(r7)
            goto L53
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r5
        L33:
            defpackage.sf5.h0(r7)
            goto L3d
        L37:
            defpackage.sf5.h0(r7)
            r1.G = r4
            r7 = r5
        L3d:
            crd r7 = (defpackage.crd) r7
            java.lang.Object r2 = r6.G
            c45 r2 = (defpackage.c45) r2
            dx r4 = new dx
            r4.<init>(r0, r7, r6, r5)
            r1.G = r3
            java.lang.Object r6 = defpackage.gb9.c0(r2, r4, r1)
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L53
            return r7
        L53:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el5.v(vp4):java.lang.Object");
    }

    public void w(bz7 bz7Var) {
        int i;
        synchronized (this.E) {
            try {
                qvb qvbVar = (qvb) this.H;
                this.H = (qvb) this.I;
                this.I = qvbVar;
                t11 t11Var = (t11) this.G;
                do {
                    i = t11Var.get();
                } while (!t11Var.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = qvbVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    bz7Var.invoke(qvbVar.f(i3));
                }
                qvbVar.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float x(int i, boolean z) {
        Layout layout = (Layout) this.E;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float y(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.E;
        if (!z2) {
            return x(i, z);
        }
        int iB = dch.B(layout, i, z2);
        int lineStart = layout.getLineStart(iB);
        int lineEnd = layout.getLineEnd(iB);
        if (i != lineStart && i != lineEnd) {
            return x(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return x(i, z);
        }
        int iZ = z(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(A(iZ))) == -1;
        int iC = C(lineEnd, lineStart);
        int iA = A(iZ);
        int i4 = lineStart - iA;
        int i5 = iC - iA;
        Bidi bidiP = p(iZ);
        Bidi bidiCreateLineBidi = bidiP != null ? bidiP.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iB) : layout.getLineRight(iB);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        hu9[] hu9VarArr = new hu9[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            hu9VarArr[i6] = new hu9(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, hu9VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (hu9VarArr[i8].b() == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == hu9VarArr[i3].c()) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iB) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(hu9VarArr[i3 - 1].b()) : layout.getPrimaryHorizontal(hu9VarArr[i3 + 1].b()) : layout.getLineRight(iB);
        }
        int iC2 = i > iC ? C(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (hu9VarArr[i9].a() == iC2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == hu9VarArr[i2].c()) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iB) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(hu9VarArr[i2 - 1].a()) : layout.getPrimaryHorizontal(hu9VarArr[i2 + 1].a()) : layout.getLineRight(iB);
    }

    public int z(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.F;
        int iU = x44.u(arrayList, Integer.valueOf(i));
        int i2 = iU < 0 ? -(iU + 1) : iU + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public el5(ah5 ah5Var, String str, File file, h99 h99Var, cbf cbfVar) {
        str.getClass();
        h99Var.getClass();
        this.E = ah5Var;
        this.F = str;
        this.G = file;
        this.H = h99Var;
        this.I = cbfVar;
    }

    public el5(ah5 ah5Var, String str, File file, h99 h99Var, g4d g4dVar) {
        h99Var.getClass();
        this.E = ah5Var;
        this.F = str;
        this.G = file;
        this.H = h99Var;
        this.I = g4dVar;
    }

    public el5(ivd ivdVar, ivd ivdVar2, w3c w3cVar, ivd ivdVar3, ivd ivdVar4) {
        this.E = ivdVar;
        this.F = ivdVar2;
        this.G = w3cVar;
        this.H = ivdVar3;
        this.I = ivdVar4;
    }

    public el5(int i) {
        switch (i) {
            case 10:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.E = linkedHashSet;
                this.F = linkedHashSet2;
                this.G = linkedHashSet3;
                this.H = linkedHashMap;
                this.I = null;
                break;
            case 16:
                this.G = new ArrayList();
                this.H = new ArrayList();
                break;
            default:
                this.E = new Object();
                this.G = new t11(0);
                this.H = new qvb();
                this.I = new qvb();
                break;
        }
    }

    public el5(Layout layout) {
        this.E = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iF0 = bsg.F0(((Layout) this.E).getText(), '\n', length, 4);
            length = iF0 < 0 ? ((Layout) this.E).getText().length() : iF0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.E).getText().length());
        this.F = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.G = arrayList2;
        this.H = new boolean[((ArrayList) this.F).size()];
        ((ArrayList) this.F).size();
    }

    public el5(pl9 pl9Var, mpa mpaVar, q59 q59Var, mpa mpaVar2) {
        pl9Var.getClass();
        this.E = pl9Var;
        this.F = mpaVar;
        this.G = q59Var;
        this.H = mpaVar2;
    }

    public el5(Context context, mn5 mn5Var, w72 w72Var, dpf dpfVar) {
        this.E = context;
        this.F = mn5Var;
        this.G = w72Var;
        this.H = dpfVar;
        this.I = new q28(context, 25, dpfVar);
    }

    public el5(p94 p94Var, da4 da4Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<iz5> set = p94Var.c;
        Set set2 = p94Var.g;
        for (iz5 iz5Var : set) {
            int i = iz5Var.c;
            int i2 = iz5Var.b;
            boolean z = i == 0;
            qzd qzdVar = iz5Var.a;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(qzdVar);
                } else {
                    hashSet.add(qzdVar);
                }
            } else if (i == 2) {
                hashSet3.add(qzdVar);
            } else if (i2 == 2) {
                hashSet5.add(qzdVar);
            } else {
                hashSet2.add(qzdVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(qzd.a(uwd.class));
        }
        this.E = Collections.unmodifiableSet(hashSet);
        this.F = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.G = Collections.unmodifiableSet(hashSet4);
        this.H = Collections.unmodifiableSet(hashSet5);
        this.I = da4Var;
    }

    public el5(h99 h99Var, bt9 bt9Var) {
        ub ubVar = new ub();
        h99Var.getClass();
        this.H = h99Var;
        this.E = ubVar;
        this.F = bt9Var;
        this.G = new LinkedHashMap();
        this.I = new LinkedHashMap();
    }

    public el5(nff nffVar) {
        this.E = new lpg();
        h86 h86Var = nffVar.c;
        this.F = h86Var.getDefault();
        this.G = h86Var.b();
        this.H = h86Var.b();
        this.I = fd9.c(nai.Z(iuj.g(), new al3(zp3.G, 3)));
    }

    public el5(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.H = new ArrayDeque();
        this.E = sharedPreferences;
        this.F = "topic_operation_queue";
        this.G = ",";
        this.I = scheduledThreadPoolExecutor;
    }

    public el5(ke9 ke9Var, tai taiVar, kw9 kw9Var) {
        taiVar.getClass();
        this.E = ke9Var;
        this.F = taiVar;
        this.G = kw9Var;
        this.H = kw9Var;
        taiVar.getClass();
        fj0 fj0Var = new fj0();
        fj0Var.E = this;
        fj0Var.F = taiVar;
        fj0Var.G = new cbf(new lja(26));
        this.I = fj0Var;
    }

    public el5(na4 na4Var) {
        this.E = w44.q1(na4Var.a);
        this.F = w44.q1(na4Var.b);
        this.G = w44.q1(na4Var.c);
        List list = (List) na4Var.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p7(16, (cpc) it.next()));
        }
        this.H = arrayList;
        List list2 = (List) na4Var.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new ma4((no5) it2.next(), 1));
        }
        this.I = arrayList2;
    }

    public el5(kl7 kl7Var) {
        kl7Var.getClass();
        this.E = kl7Var;
        this.F = new qv1();
        this.G = new qv1();
        this.H = dgj.d;
    }

    public el5(noh nohVar, wp6 wp6Var, d77 d77Var, kl7 kl7Var, ta4 ta4Var) {
        this.E = nohVar;
        this.F = wp6Var;
        this.G = d77Var;
        this.H = kl7Var;
        this.I = ta4Var;
    }

    public el5(qre qreVar) {
        this.G = new ArrayList();
        this.H = new ArrayList();
        t82 t82Var = qreVar.b;
        List list = qreVar.f;
        this.E = t82Var;
        this.F = qreVar.c;
        List list2 = qreVar.d;
        int size = list2.size() - qreVar.e;
        for (int i = 1; i < size; i++) {
            ((ArrayList) this.G).add((ar4) list2.get(i));
        }
        int size2 = list.size() - qreVar.g;
        for (int i2 = 0; i2 < size2; i2++) {
            ((ArrayList) this.H).add((w82) list.get(i2));
        }
        this.I = qreVar.h;
    }

    public el5(ClaudeDatabase claudeDatabase) {
        this.E = claudeDatabase;
        xz8 xz8Var = new xz8();
        this.F = xz8Var;
        this.G = new jxb();
        this.H = new kq4(this);
        this.I = xz8Var;
    }

    public el5(bi5 bi5Var, List list, c45 c45Var) {
        c45Var.getClass();
        this.I = bi5Var;
        this.E = new jxb();
        this.F = zni.c();
        this.G = c45Var;
        this.H = w44.p1(list);
    }
}
