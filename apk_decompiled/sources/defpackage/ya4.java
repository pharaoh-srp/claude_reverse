package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Loading;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItem;
import com.anthropic.claude.tool.model.EventDeleteDetails;
import com.anthropic.claude.tool.model.EventUpdateDetails;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemAvailability;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemNudgesItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrence;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemStatus;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ya4 implements sz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ya4(int i) {
        this.E = i;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        mnc mncVar = (mnc) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iH = ebh.h((Integer) obj4, (s64) obj, mncVar);
        if ((iH & 48) == 0) {
            iH |= ((e18) ld4Var).f(mncVar) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iH & 1, (iH & 145) != 144)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.I(fqbVar, mncVar);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b("Lorem Ipsum", gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 54, 0, 262140);
            tjh.b("Dolor Sit Amet", gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 54, 0, 262140);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        tkh tkhVar = (tkh) obj;
        pz7 pz7Var = (pz7) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        tkhVar.getClass();
        pz7Var.getClass();
        if ((iIntValue & 6) == 0) {
            i = (((e18) ld4Var).f(tkhVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((e18) ld4Var).h(pz7Var) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            tjh.a(tkhVar, pz7Var, e18Var, i & 126);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        tkh tkhVar = (tkh) obj;
        pz7 pz7Var = (pz7) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        tkhVar.getClass();
        pz7Var.getClass();
        int i2 = 4;
        if ((iIntValue & 6) == 0) {
            i = (((e18) ld4Var).f(tkhVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((e18) ld4Var).h(pz7Var) ? 32 : 16;
        }
        byte b = 0;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            j8.c(bte.a.a(tkhVar), fd9.q0(2071797151, new dt(pz7Var, i2, b), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((px9) obj).getClass();
        str.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= ((e18) ld4Var).f(str) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
            boolean zEquals = str.equals("Option 2");
            qnc qncVarB = gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1);
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new oob(19);
                e18Var.k0(objN);
            }
            kvk.b(str, (zy7) objN, iqbVarC, null, zEquals, null, null, false, null, 0, qncVarB, null, e18Var, ((iIntValue >> 3) & 14) | 432, 6, 3048);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((px9) obj).getClass();
        str.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= ((e18) ld4Var).f(str) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new oob(19);
                e18Var.k0(objN);
            }
            kvk.b(str, (zy7) objN, b.c(fqb.E, 1.0f), null, false, null, null, false, null, 0, null, null, e18Var, ((iIntValue >> 3) & 14) | 432, 0, 4088);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((px9) obj).getClass();
        str.getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= ((e18) ld4Var).f(str) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
            qnc qncVarB = gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1);
            iqb iqbVarC = b.c(fqb.E, 1.0f);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new oob(19);
                e18Var.k0(objN);
            }
            kvk.b(str, (zy7) objN, iqbVarC, null, false, null, null, false, null, 0, qncVarB, null, e18Var, ((iIntValue >> 3) & 14) | 432, 6, 3064);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        wb7 wb7Var = (wb7) obj;
        SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        wb7Var.getClass();
        sttSupportedLanguage.getClass();
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? ((e18) ld4Var).f(wb7Var) : ((e18) ld4Var).h(wb7Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((e18) ld4Var).f(sttSupportedLanguage) ? 32 : 16;
        }
        int i2 = 0;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            long j = gm3.a(e18Var).p;
            e0g e0gVar = gm3.b(e18Var).q;
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v);
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new fc4(i2);
                e18Var.k0(objN);
            }
            pzg.a(wb7Var.b(tjf.b(fqb.E, true, (bz7) objN), "PrimaryNotEditable", true), e0gVar, j, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, qu1VarA, fd9.q0(240392835, new gc4(sttSupportedLanguage, i2), e18Var), e18Var, 12582912, 56);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4) {
        mnc mncVar = (mnc) obj2;
        ld4 ld4Var = (ld4) obj3;
        int iH = ebh.h((Integer) obj4, (s64) obj, mncVar);
        if ((iH & 48) == 0) {
            iH |= ((e18) ld4Var).f(mncVar) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iH & 1, (iH & 145) != 144)) {
            xjk.h(gb9.I(fqb.E, mncVar), e18Var, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        ld4 ld4Var = (ld4) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((h5e) obj).getClass();
        ((AsyncImagePainter$State$Loading) obj2).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 129) != 128)) {
            FillElement fillElement = b.c;
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fillElement);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ez1.a(null, null, gm3.a(e18Var).N, e18Var, 0, 3);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ud0 ud0Var;
        long j;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j2;
        int i12 = this.E;
        eo0 eo0Var = ko0.c;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i12) {
            case 0:
                cte cteVar = (cte) obj;
                jz0 jz0Var = (jz0) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                cteVar.getClass();
                jz0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (((e18) ld4Var).f(cteVar) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= ((e18) ld4Var).f(jz0Var) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i & 1, (i & 147) != 146)) {
                    e18Var.T();
                } else if (jz0Var.b.b == null) {
                    e18Var.a0(316471848);
                    mpk.b("", null, null, null, 0, false, 0, 0, e18Var, 6, 1022);
                    e18Var.p(false);
                } else {
                    e18Var.a0(316530779);
                    wvk.o(cteVar, jz0Var, e18Var, i & 126);
                    e18Var.p(false);
                }
                return ieiVar;
            case 1:
                cte cteVar2 = (cte) obj;
                jz0 jz0Var2 = (jz0) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                cteVar2.getClass();
                jz0Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (((e18) ld4Var2).f(cteVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= ((e18) ld4Var2).f(jz0Var2) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
                    e18Var2.T();
                } else if (jz0Var2.b.b == null) {
                    e18Var2.a0(-1625706617);
                    mpk.b("", null, null, null, 0, false, 0, 0, e18Var2, 6, 1022);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(-1625647686);
                    wvk.o(cteVar2, jz0Var2, e18Var2, i2 & 126);
                    e18Var2.p(false);
                }
                return ieiVar;
            case 2:
                EventCreateV1InputNewEventsItem eventCreateV1InputNewEventsItem = (EventCreateV1InputNewEventsItem) obj2;
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((s64) obj).getClass();
                eventCreateV1InputNewEventsItem.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(eventCreateV1InputNewEventsItem) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    tjh.b(eventCreateV1InputNewEventsItem.getTitle(), b.c(fqbVar, 1.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).h, e18Var3, 48, 0, 131068);
                    kxk.g(e18Var3, b.e(fqbVar, 8.0f));
                    tjh.b(ij0.C(zx6.a(eventCreateV1InputNewEventsItem.getStart_time(), eventCreateV1InputNewEventsItem.getEnd_time()), " • ", zx6.b(eventCreateV1InputNewEventsItem.getStart_time(), eventCreateV1InputNewEventsItem.getEnd_time())), b.c(fqbVar, 1.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var3, 48, 0, 262140);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                EventDeleteDetails eventDeleteDetails = (EventDeleteDetails) obj2;
                ld4 ld4Var4 = (ld4) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((s64) obj).getClass();
                eventDeleteDetails.getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(eventDeleteDetails) ? 32 : 16;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    tjh.b(eventDeleteDetails.getTitle(), b.c(fqbVar, 1.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).h, e18Var4, 48, 0, 131068);
                    kxk.g(e18Var4, b.e(fqbVar, 8.0f));
                    tjh.b(ij0.C(zx6.a(eventDeleteDetails.getStartTime(), eventDeleteDetails.getEndTime()), " • ", zx6.b(eventDeleteDetails.getStartTime(), eventDeleteDetails.getEndTime())), b.c(fqbVar, 1.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var4, 48, 0, 262140);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                EventUpdateDetails eventUpdateDetails = (EventUpdateDetails) obj2;
                ld4 ld4Var5 = (ld4) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                ((s64) obj).getClass();
                eventUpdateDetails.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= ((e18) ld4Var5).f(eventUpdateDetails) ? 32 : 16;
                }
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    tjh.b(eventUpdateDetails.getCurrentEventTitle(), b.c(fqbVar, 1.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).h, e18Var5, 48, 0, 131068);
                    EventUpdateV0InputEventUpdatesItem updateData = eventUpdateDetails.getUpdateData();
                    ArrayList arrayList = new ArrayList();
                    String title = updateData.getTitle();
                    if (title == null) {
                        e18Var5.a0(930218044);
                    } else {
                        e18Var5.a0(930218045);
                        arrayList.add(d4c.k0(R.string.calendar_field_title, new Object[]{title}, e18Var5));
                    }
                    e18Var5.p(false);
                    OffsetDateTime start_time = updateData.getStart_time();
                    if (start_time == null) {
                        e18Var5.a0(930326389);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(930326390);
                        String str = zx6.b.format(start_time);
                        str.getClass();
                        arrayList.add(d4c.k0(R.string.calendar_field_start_time, new Object[]{str}, e18Var5));
                        e18Var5.p(false);
                    }
                    OffsetDateTime end_time = updateData.getEnd_time();
                    if (end_time == null) {
                        e18Var5.a0(930562423);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(930562424);
                        String str2 = zx6.b.format(end_time);
                        str2.getClass();
                        arrayList.add(d4c.k0(R.string.calendar_field_end_time, new Object[]{str2}, e18Var5));
                        e18Var5.p(false);
                    }
                    EventUpdateV0InputEventUpdatesItemRecurrence recurrence = updateData.getRecurrence();
                    String human_readable_frequency = recurrence != null ? recurrence.getHuman_readable_frequency() : null;
                    if (human_readable_frequency == null) {
                        e18Var5.a0(930823598);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(930823599);
                        arrayList.add(d4c.k0(R.string.calendar_field_repeats, new Object[]{human_readable_frequency}, e18Var5));
                        e18Var5.p(false);
                    }
                    String location = updateData.getLocation();
                    if (location == null) {
                        e18Var5.a0(931031577);
                    } else {
                        e18Var5.a0(931031578);
                        arrayList.add(d4c.k0(R.string.calendar_field_location, new Object[]{location}, e18Var5));
                    }
                    e18Var5.p(false);
                    String event_description = updateData.getEvent_description();
                    if (event_description == null) {
                        e18Var5.a0(931145750);
                    } else {
                        e18Var5.a0(931145751);
                        arrayList.add(d4c.k0(R.string.calendar_field_description, new Object[]{event_description}, e18Var5));
                    }
                    e18Var5.p(false);
                    List<String> attendees = updateData.getAttendees();
                    if (attendees == null) {
                        e18Var5.a0(931258745);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(931258746);
                        arrayList.add(d4c.k0(R.string.calendar_field_attendees, new Object[]{w44.S0(attendees, ", ", null, null, null, 62)}, e18Var5));
                        e18Var5.p(false);
                    }
                    Boolean all_day = updateData.getAll_day();
                    if (all_day == null) {
                        e18Var5.a0(931486223);
                    } else {
                        e18Var5.a0(931486224);
                        arrayList.add(d4c.k0(R.string.calendar_field_all_day, new Object[]{String.valueOf(all_day.booleanValue())}, e18Var5));
                    }
                    e18Var5.p(false);
                    EventUpdateV0InputEventUpdatesItemAvailability availability = updateData.getAvailability();
                    if (availability == null) {
                        e18Var5.a0(931620577);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(931620578);
                        int i13 = ab4.a[availability.ordinal()];
                        if (i13 == 1) {
                            i3 = -1618581456;
                            i4 = R.string.calendar_availability_busy;
                        } else if (i13 == 2) {
                            i3 = -1618577520;
                            i4 = R.string.calendar_availability_free;
                        } else {
                            if (i13 != 3) {
                                throw ebh.u(e18Var5, -1618584069, false);
                            }
                            i3 = -1618573419;
                            i4 = R.string.calendar_availability_tentative;
                        }
                        arrayList.add(d4c.k0(R.string.calendar_field_availability, new Object[]{vb7.n(e18Var5, i3, i4, e18Var5, false)}, e18Var5));
                        e18Var5.p(false);
                    }
                    EventUpdateV0InputEventUpdatesItemStatus status = updateData.getStatus();
                    if (status == null) {
                        e18Var5.a0(932222287);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(932222288);
                        int i14 = ab4.b[status.ordinal()];
                        if (i14 == 1) {
                            i5 = -558814779;
                            i6 = R.string.calendar_status_confirmed;
                        } else if (i14 == 2) {
                            i5 = -558810907;
                            i6 = R.string.calendar_status_tentative;
                        } else {
                            if (i14 != 3) {
                                throw ebh.u(e18Var5, -558817189, false);
                            }
                            i5 = -558807035;
                            i6 = R.string.calendar_status_cancelled;
                        }
                        arrayList.add(d4c.k0(R.string.calendar_field_status, new Object[]{vb7.n(e18Var5, i5, i6, e18Var5, false)}, e18Var5));
                        e18Var5.p(false);
                    }
                    List<EventUpdateV0InputEventUpdatesItemNudgesItem> nudges = updateData.getNudges();
                    if (nudges == null) {
                        e18Var5.a0(932770708);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(932770709);
                        if (nudges.isEmpty()) {
                            e18Var5.a0(-1811194731);
                            e18Var5.p(false);
                        } else {
                            e18Var5.a0(-1811368672);
                            arrayList.add(d4c.f0(R.plurals.calendar_reminders_count, nudges.size(), new Object[]{Integer.valueOf(nudges.size())}, e18Var5));
                            e18Var5.p(false);
                        }
                        e18Var5.p(false);
                    }
                    if (arrayList.isEmpty()) {
                        e18Var5.a0(933672809);
                        e18Var5.p(false);
                    } else {
                        sq6.A(8.0f, 933066418, e18Var5, e18Var5, fqbVar);
                        tjh.b(d4c.j0(R.string.calendar_edits_header, e18Var5), b.c(fqbVar, 1.0f), gm3.a(e18Var5).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).i, e18Var5, 48, 0, 131064);
                        kxk.g(e18Var5, b.e(fqbVar, 4.0f));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            tjh.b((String) it.next(), b.c(fqbVar, 1.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).i, e18Var5, 48, 0, 131068);
                        }
                        e18Var5.p(false);
                    }
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 5:
                by2 by2Var = (by2) obj2;
                ld4 ld4Var6 = (ld4) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((c90) obj).getClass();
                by2Var.getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).d(by2Var.ordinal()) ? 32 : 16;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    e18Var6.T();
                    return ieiVar;
                }
                boolean z = by2Var != by2.E;
                if (z) {
                    int iOrdinal = by2Var.ordinal();
                    if (iOrdinal == 0) {
                        ud0Var = ud0.K;
                    } else {
                        if (iOrdinal != 1) {
                            wg6.i();
                            return null;
                        }
                        ud0Var = ud0.s1;
                    }
                } else {
                    ud0Var = ud0.p0;
                }
                bpc bpcVarA = a.a(ud0Var, e18Var6);
                if (z) {
                    e18Var6.a0(-307790059);
                    j = gm3.a(e18Var6).F;
                } else {
                    e18Var6.a0(-307788974);
                    j = ((d54) e18Var6.j(on4.a)).a;
                }
                e18Var6.p(false);
                cv8.b(bpcVarA, null, b.o(fqbVar, 20.0f), j, e18Var6, 440, 0);
                return ieiVar;
            case 6:
                iqb iqbVar = (iqb) obj2;
                ld4 ld4Var7 = (ld4) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                ((zy7) obj).getClass();
                iqbVar.getClass();
                if ((iIntValue7 & 48) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).f(iqbVar) ? 32 : 16;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 145) != 144)) {
                    euk.l(iqbVar, e18Var7, (iIntValue7 >> 3) & 14);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case 7:
                zy7 zy7Var = (zy7) obj;
                iqb iqbVar2 = (iqb) obj2;
                ld4 ld4Var8 = (ld4) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                zy7Var.getClass();
                iqbVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    i7 = iIntValue8 | (((e18) ld4Var8).h(zy7Var) ? 4 : 2);
                } else {
                    i7 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i7 |= ((e18) ld4Var8).f(iqbVar2) ? 32 : 16;
                }
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(i7 & 1, (i7 & 147) != 146)) {
                    dmk.a(zy7Var, iqbVar2, e18Var8, i7 & 126);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 8:
                zy7 zy7Var2 = (zy7) obj;
                iqb iqbVar3 = (iqb) obj2;
                ld4 ld4Var9 = (ld4) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                zy7Var2.getClass();
                iqbVar3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    i8 = iIntValue9 | (((e18) ld4Var9).h(zy7Var2) ? 4 : 2);
                } else {
                    i8 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i8 |= ((e18) ld4Var9).f(iqbVar3) ? 32 : 16;
                }
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(i8 & 1, (i8 & 147) != 146)) {
                    pnk.c(zy7Var2, iqbVar3, e18Var9, i8 & 126);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 9:
                zy7 zy7Var3 = (zy7) obj;
                iqb iqbVar4 = (iqb) obj2;
                ld4 ld4Var10 = (ld4) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                zy7Var3.getClass();
                iqbVar4.getClass();
                if ((iIntValue10 & 6) == 0) {
                    i9 = iIntValue10 | (((e18) ld4Var10).h(zy7Var3) ? 4 : 2);
                } else {
                    i9 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i9 |= ((e18) ld4Var10).f(iqbVar4) ? 32 : 16;
                }
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(i9 & 1, (i9 & 147) != 146)) {
                    pnk.c(zy7Var3, iqbVar4, e18Var10, i9 & 126);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case 10:
                String str3 = (String) obj;
                mnc mncVar = (mnc) obj2;
                ld4 ld4Var11 = (ld4) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                str3.getClass();
                mncVar.getClass();
                if ((iIntValue11 & 6) == 0) {
                    i10 = iIntValue11 | (((e18) ld4Var11).f(str3) ? 4 : 2);
                } else {
                    i10 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i10 |= ((e18) ld4Var11).f(mncVar) ? 32 : 16;
                }
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(i10 & 1, (i10 & 147) != 146)) {
                    owj.b(str3, null, 0L, null, xn5.q0(mncVar, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1)), e18Var11, i10 & 14, 14);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case 11:
                String str4 = (String) obj;
                mnc mncVar2 = (mnc) obj2;
                ld4 ld4Var12 = (ld4) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                str4.getClass();
                mncVar2.getClass();
                if ((iIntValue12 & 6) == 0) {
                    i11 = iIntValue12 | (((e18) ld4Var12).f(str4) ? 4 : 2);
                } else {
                    i11 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i11 |= ((e18) ld4Var12).f(mncVar2) ? 32 : 16;
                }
                e18 e18Var12 = (e18) ld4Var12;
                if (e18Var12.Q(i11 & 1, (i11 & 147) != 146)) {
                    owj.b(str4, null, 0L, null, xn5.q0(mncVar2, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1)), e18Var12, i11 & 14, 14);
                } else {
                    e18Var12.T();
                }
                return ieiVar;
            case 12:
                mnc mncVar3 = (mnc) obj2;
                ld4 ld4Var13 = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, mncVar3);
                if ((iH & 48) == 0) {
                    iH |= ((e18) ld4Var13).f(mncVar3) ? 32 : 16;
                }
                e18 e18Var13 = (e18) ld4Var13;
                if (e18Var13.Q(iH & 1, (iH & 145) != 144)) {
                    iqb iqbVarI = gb9.I(fqbVar, mncVar3);
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var13, 0);
                    int iHashCode = Long.hashCode(e18Var13.T);
                    hyc hycVarL = e18Var13.l();
                    iqb iqbVarE = kxk.E(e18Var13, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var13.e0();
                    if (e18Var13.S) {
                        e18Var13.k(re4Var);
                    } else {
                        e18Var13.n0();
                    }
                    d4c.i0(e18Var13, cd4.f, q64VarA);
                    d4c.i0(e18Var13, cd4.e, hycVarL);
                    d4c.i0(e18Var13, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var13, cd4.h);
                    d4c.i0(e18Var13, cd4.d, iqbVarE);
                    tjh.b("Hello", gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var13, 54, 0, 262140);
                    tjh.b("World", gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var13, 54, 0, 262140);
                    e18Var13.p(true);
                } else {
                    e18Var13.T();
                }
                return ieiVar;
            case 13:
                mnc mncVar4 = (mnc) obj2;
                ld4 ld4Var14 = (ld4) obj3;
                int iH2 = ebh.h((Integer) obj4, (s64) obj, mncVar4);
                if ((iH2 & 48) == 0) {
                    iH2 |= ((e18) ld4Var14).f(mncVar4) ? 32 : 16;
                }
                e18 e18Var14 = (e18) ld4Var14;
                if (e18Var14.Q(iH2 & 1, (iH2 & 145) != 144)) {
                    iqb iqbVarI2 = gb9.I(fqbVar, mncVar4);
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var14, 0);
                    int iHashCode2 = Long.hashCode(e18Var14.T);
                    hyc hycVarL2 = e18Var14.l();
                    iqb iqbVarE2 = kxk.E(e18Var14, iqbVarI2);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var14.e0();
                    if (e18Var14.S) {
                        e18Var14.k(re4Var2);
                    } else {
                        e18Var14.n0();
                    }
                    d4c.i0(e18Var14, cd4.f, q64VarA2);
                    d4c.i0(e18Var14, cd4.e, hycVarL2);
                    d4c.i0(e18Var14, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var14, cd4.h);
                    d4c.i0(e18Var14, cd4.d, iqbVarE2);
                    tjh.b("You Can't", gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var14, 54, 0, 262140);
                    tjh.b("See Me", gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var14, 54, 0, 262140);
                    e18Var14.p(true);
                } else {
                    e18Var14.T();
                }
                return ieiVar;
            case 14:
                return d(obj, obj2, obj3, obj4);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                gnd gndVar = (gnd) obj2;
                ld4 ld4Var15 = (ld4) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((c90) obj).getClass();
                gndVar.getClass();
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= ((e18) ld4Var15).d(gndVar.ordinal()) ? 32 : 16;
                }
                e18 e18Var15 = (e18) ld4Var15;
                if (e18Var15.Q(iIntValue13 & 1, (iIntValue13 & 145) != 144)) {
                    boolean z2 = gndVar != gnd.F;
                    ud0 ud0VarA = z2 ? hnd.a(gndVar) : ud0.p0;
                    ud0 ud0Var2 = ud0.d;
                    bpc bpcVarA2 = a.a(ud0VarA, e18Var15);
                    if (z2) {
                        e18Var15.a0(1913111930);
                        j2 = gm3.a(e18Var15).F;
                    } else {
                        e18Var15.a0(1913113015);
                        j2 = ((d54) e18Var15.j(on4.a)).a;
                    }
                    e18Var15.p(false);
                    cv8.b(bpcVarA2, null, b.o(fqbVar, 20.0f), j2, e18Var15, 440, 0);
                } else {
                    e18Var15.T();
                }
                return ieiVar;
            case 16:
                return e(obj, obj2, obj3, obj4);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return f(obj, obj2, obj3, obj4);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return g(obj, obj2, obj3, obj4);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return h(obj, obj2, obj3, obj4);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return n(obj, obj2, obj3, obj4);
            case 21:
                return o(obj, obj2, obj3, obj4);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return p(obj, obj2, obj3, obj4);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return q(obj, obj2, obj3, obj4);
            default:
                ld4 ld4Var16 = (ld4) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((h5e) obj).getClass();
                ((AsyncImagePainter$State$Error) obj2).getClass();
                e18 e18Var16 = (e18) ld4Var16;
                if (e18Var16.Q(iIntValue14 & 1, (iIntValue14 & 129) != 128)) {
                    FillElement fillElement = b.c;
                    o5b o5bVarD = dw1.d(lja.K, false);
                    int iHashCode3 = Long.hashCode(e18Var16.T);
                    hyc hycVarL3 = e18Var16.l();
                    iqb iqbVarE3 = kxk.E(e18Var16, fillElement);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var16.e0();
                    if (e18Var16.S) {
                        e18Var16.k(re4Var3);
                    } else {
                        e18Var16.n0();
                    }
                    d4c.i0(e18Var16, cd4.f, o5bVarD);
                    d4c.i0(e18Var16, cd4.e, hycVarL3);
                    d4c.i0(e18Var16, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var16, cd4.h);
                    d4c.i0(e18Var16, cd4.d, iqbVarE3);
                    cv8.b(a.a(ud0.K1, e18Var16), d4c.j0(R.string.generic_error_something_went_wrong, e18Var16), b.o(fqbVar, 48.0f), gm3.a(e18Var16).O, e18Var16, 392, 0);
                    e18Var16.p(true);
                } else {
                    e18Var16.T();
                }
                return ieiVar;
        }
    }
}
