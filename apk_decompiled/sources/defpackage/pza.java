package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.internal.ripple.RippleNode;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.mainactivity.MainActivity;
import com.anthropic.claude.models.organization.configtypes.GroveConfig;
import com.anthropic.claude.tool.custom.PhoneCallMonitorCommand;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItem;
import com.anthropic.claude.tool.model.Tool;
import com.anthropic.claude.wear.PhoneWearableListenerService;
import com.caverock.androidsvg.a;
import com.caverock.androidsvg.b;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okio.BufferedSource;
import okio.ByteString;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pza implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ pza(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.zy7
    public final Object a() throws Throwable {
        boolean z;
        zy7 zy7Var;
        Throwable th;
        i49 i49VarQ;
        float f;
        float f2;
        qjc qjcVar;
        float fMax;
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((sza) obj).getCallbacks();
            case 1:
                return (m66) ((r4e) obj).a.e.getValue();
            case 2:
                return Boolean.valueOf(((f1c) obj).b());
            case 3:
                c9c c9cVar = (c9c) obj;
                gb9.D(c9cVar.a, null, null, new al8(c9cVar, (tp4) null, 20), 3);
                return iei.a;
            case 4:
                return "Unexpected end of input: yet to parse ".concat(((bac) obj).b());
            case 5:
                te3 te3Var = (te3) ((zqc) obj).F.getValue();
                ie3 ie3Var = (ie3) w44.V0(te3Var.a);
                bga bgaVar = ie3Var != null ? (bga) ie3Var.a : null;
                ie3 ie3Var2 = (ie3) w44.V0(te3Var.b);
                return new cpc(bgaVar, ie3Var2 != null ? (bga) ie3Var2.a : null);
            case 6:
                GroveConfig groveConfig = (GroveConfig) ((tec) obj).e.g("claude_grove_config", GroveConfig.Companion.serializer()).getValue();
                if (groveConfig != null) {
                    return groveConfig.getMobile_strings();
                }
                return null;
            case 7:
                btc btcVar = (btc) obj;
                List list = btcVar.a;
                Context context = x44.d;
                if (context == null) {
                    sz6.j("Context not initialized");
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                List list2 = btcVar.b;
                if (!list.isEmpty()) {
                    String string = context.getString(R.string.knowledge_sources_heading_citations);
                    string.getClass();
                    sb.append(rta.h(string, list));
                    if (!list2.isEmpty()) {
                        sb.append("\n\n");
                        String string2 = context.getString(R.string.knowledge_sources_heading_more_sources);
                        string2.getClass();
                        sb.append(rta.h(string2, list2));
                    }
                } else if (!list2.isEmpty()) {
                    String string3 = context.getString(R.string.knowledge_sources_heading_sources);
                    string3.getClass();
                    sb.append(rta.h(string3, list2));
                }
                return sb.toString();
            case 8:
                htc htcVar = (htc) obj;
                Context context2 = x44.d;
                if (context2 == null) {
                    sz6.j("Context not initialized");
                    return null;
                }
                Tool tool = htcVar.b;
                String str = htcVar.c;
                boolean z2 = htcVar.e;
                tool.getClass();
                if (str != null) {
                    String string4 = !z2 ? context2.getString(R.string.search_tool_searching_for_query, str) : context2.getString(R.string.search_tool_searched_for_query, str);
                    string4.getClass();
                    return string4;
                }
                if (tool instanceof Tool.DriveSearch) {
                    String string5 = !z2 ? context2.getString(R.string.search_tool_searching_drive) : context2.getString(R.string.search_tool_searched_drive);
                    string5.getClass();
                    return string5;
                }
                if (tool instanceof Tool.WebSearch) {
                    String string6 = !z2 ? context2.getString(R.string.search_tool_searching_web) : context2.getString(R.string.search_tool_searched_web);
                    string6.getClass();
                    return string6;
                }
                String string7 = !z2 ? context2.getString(R.string.search_tool_searching_sources) : context2.getString(R.string.search_tool_searched_sources);
                string7.getClass();
                return string7;
            case 9:
                v0d v0dVar = (v0d) obj;
                ih9 ih9Var = v0dVar.i;
                e1d e1dVar = PhoneCallMonitorCommand.Companion;
                e1dVar.getClass();
                PhoneCallMonitorCommand phoneCallMonitorCommand = PhoneCallMonitorCommand.endCall;
                ih9Var.getClass();
                String strD = ih9Var.d(phoneCallMonitorCommand, e1dVar.serializer());
                p5e p5eVar = v0dVar.f;
                if (p5eVar != null) {
                    ByteString byteString = ByteString.H;
                    zH = p5eVar.h(1, ByteString.Companion.b(strD));
                }
                if (zH) {
                    v0dVar.d.setValue(Boolean.TRUE);
                } else {
                    sfa sfaVar = sfa.WARN;
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj2)).getClass();
                            arrayList.add(obj2);
                        }
                        if (!arrayList.isEmpty()) {
                            zfa.a.getClass();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfaVar, "PhoneCallMonitor", "Failed to enqueue end_call (socket closed or queue full)");
                            }
                        }
                    }
                }
                return iei.a;
            case 10:
                int i2 = PhoneWearableListenerService.R;
                return fd9.c(nai.Z(iuj.g(), ((h86) ((PhoneWearableListenerService) obj).M.getValue()).b()));
            case 11:
                return vb7.s(new StringBuilder("Unexpected end of input: yet to parse '"), ((h4d) obj).a, '\'');
            case 12:
                v8d v8dVar = (v8d) obj;
                jnf jnfVarN = j8.n("kotlinx.serialization.Polymorphic", s8d.l, new SerialDescriptor[0], new d6d(2, v8dVar));
                pl9 pl9Var = v8dVar.a;
                pl9Var.getClass();
                return new vo4(jnfVarN, pl9Var);
            case 13:
                AccountSettings settings = ((jgd) obj).b.a().getSettings();
                return Boolean.valueOf(settings != null ? x44.r(settings.getGrove_enabled(), Boolean.TRUE) : false);
            case 14:
                pmd pmdVar = (pmd) obj;
                return Boolean.valueOf((((Boolean) pmdVar.i.getValue()).booleanValue() || bsg.I0((String) pmdVar.g.getValue()) || bsg.I0((String) pmdVar.h.getValue())) ? false : true);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((q2d) obj).a();
                return iei.a;
            case 16:
                zkj.b((e7j) obj);
                return iei.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((p5e) obj).a();
                return iei.a;
            case g.AVG_FIELD_NUMBER /* 18 */:
                uje ujeVar = (uje) obj;
                List list3 = ujeVar.c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (!x44.r(((RequestFormInputFromUserInputFieldsItem) obj3).getOptional(), Boolean.TRUE)) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.isEmpty()) {
                    z = true;
                } else {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (((String) ujeVar.h.get(((RequestFormInputFromUserInputFieldsItem) it2.next()).getName())) == null || !(!bsg.I0(r2))) {
                            z = false;
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ReverseProtoWriter.forwardWriter_delegate$lambda$1((ReverseProtoWriter) obj);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                lrb lrbVar = (lrb) obj;
                ja8 ja8Var = (ja8) lrbVar.G;
                if (ja8Var != null) {
                    return ja8Var;
                }
                ja8 ja8VarC = yfd.X((RippleNode) lrbVar.H).getGraphicsContext().c();
                lrbVar.G = ja8VarC;
                return ja8VarC;
            case 21:
                return ((Callable) obj).call();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return obj;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                szf szfVar = (szf) obj;
                lsc lscVar = szfVar.G;
                if (((k8g) lscVar.getValue()).a == 9205357640488583168L || k8g.f(((k8g) lscVar.getValue()).a)) {
                    return null;
                }
                return szfVar.E.c(((k8g) lscVar.getValue()).a);
            case 24:
                mag magVar = (mag) obj;
                if (!((Boolean) magVar.n.getValue()).booleanValue() && (zy7Var = magVar.b) != null) {
                    zy7Var.a();
                }
                return iei.a;
            case BuildConfig.VERSION_CODE /* 25 */:
                phg phgVar = (phg) obj;
                String strC = ((whg) phgVar.c).c();
                phgVar.g.r(ehg.a);
                phgVar.b.d((int) phgVar.P(), strC.length(), phgVar.p);
                phgVar.R(xme.a);
                return iei.a;
            case 26:
                View viewInflate = View.inflate((MainActivity) ((ire) obj).F, R.layout.splash_screen_view, null);
                viewInflate.getClass();
                return (ViewGroup) viewInflate;
            case 27:
                i0h i0hVar = (i0h) obj;
                jy8 jy8Var = i0hVar.a;
                boolean z3 = i0hVar.f;
                qjc qjcVar2 = i0hVar.b;
                BufferedSource bufferedSourceG0 = jy8Var.G0();
                try {
                    i0hVar.c.getClass();
                    i49VarQ = xsc.q(bufferedSourceG0);
                    try {
                        bufferedSourceG0.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        bufferedSourceG0.close();
                    } catch (Throwable th4) {
                        mwa.p(th3, th4);
                    }
                    th = th3;
                    i49VarQ = null;
                    break;
                }
                if (th != null) {
                    throw th;
                }
                lrb lrbVar2 = (lrb) i49VarQ.F;
                lrb lrbVar3 = (lrb) i49VarQ.F;
                c1f c1fVar = (c1f) lrbVar2.F;
                if (c1fVar != null) {
                    sp0 sp0Var = c1fVar.o;
                    RectF rectF = sp0Var == null ? null : new RectF(sp0Var.b, sp0Var.c, sp0Var.g(), sp0Var.h());
                    g0h g0hVar = rectF != null ? new g0h(rectF.left, rectF.top, rectF.right, rectF.bottom) : null;
                    if (i0hVar.e && g0hVar != null) {
                        f = g0hVar.c - g0hVar.a;
                        f2 = g0hVar.d - g0hVar.b;
                    } else if (((c1f) lrbVar3.F) != null) {
                        f = lrbVar3.x().d;
                        if (((c1f) lrbVar3.F) != null) {
                            f2 = lrbVar3.x().e;
                        } else {
                            sz6.p("SVG document is empty");
                        }
                    } else {
                        sz6.p("SVG document is empty");
                    }
                    j8g j8gVar = qjcVar2.b;
                    k6f k6fVar = qjcVar2.c;
                    if (x44.r(j8gVar, j8g.c)) {
                        float fFloatValue = ((Number) i0hVar.d.invoke(qjcVar2.a)).floatValue();
                        if (f > MTTypesetterKt.kLineSkipLimitMultiplier) {
                            f *= fFloatValue;
                        }
                        if (f2 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                            f2 *= fFloatValue;
                        }
                    }
                    int iL = f > MTTypesetterKt.kLineSkipLimitMultiplier ? mwa.L(f) : 512;
                    int iL2 = f2 > MTTypesetterKt.kLineSkipLimitMultiplier ? mwa.L(f2) : 512;
                    j8g j8gVar2 = qjcVar2.b;
                    efe efeVar = mx8.b;
                    long j = c0l.j(iL, iL2, j8gVar2, k6fVar, (j8g) dch.z(qjcVar2, efeVar));
                    int i3 = (int) (j >> 32);
                    int i4 = (int) (4294967295L & j);
                    if (f <= MTTypesetterKt.kLineSkipLimitMultiplier || f2 <= MTTypesetterKt.kLineSkipLimitMultiplier) {
                        qjcVar = qjcVar2;
                    } else {
                        float f3 = i3;
                        float f4 = i4;
                        qjcVar = qjcVar2;
                        j8g j8gVar3 = (j8g) dch.z(qjcVar, efeVar);
                        float f5 = f3 / f;
                        float f6 = f4 / f2;
                        int iOrdinal = k6fVar.ordinal();
                        if (iOrdinal == 0) {
                            fMax = Math.max(f5, f6);
                        } else if (iOrdinal == 1) {
                            fMax = Math.min(f5, f6);
                        } else {
                            wg6.i();
                        }
                        if (j8gVar3.a instanceof q46) {
                            float f7 = ((q46) r3).a / f;
                            if (fMax > f7) {
                                fMax = f7;
                            }
                        }
                        if (j8gVar3.b instanceof q46) {
                            float f8 = ((q46) r3).a / f2;
                            if (fMax > f8) {
                                fMax = f8;
                            }
                        }
                        i3 = (int) (fMax * f);
                        i4 = (int) (fMax * f2);
                        if (g0hVar == null) {
                            float f9 = f - MTTypesetterKt.kLineSkipLimitMultiplier;
                            float f10 = f2 - MTTypesetterKt.kLineSkipLimitMultiplier;
                            c1f c1fVar2 = (c1f) lrbVar3.F;
                            if (c1fVar2 != null) {
                                c1fVar2.o = new sp0(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f9, f10, 2);
                            } else {
                                sz6.p("SVG document is empty");
                            }
                        }
                    }
                    c1f c1fVar3 = (c1f) lrbVar3.F;
                    if (c1fVar3 != null) {
                        c1fVar3.r = q2f.s("100%");
                        c1f c1fVar4 = (c1f) lrbVar3.F;
                        if (c1fVar4 != null) {
                            c1fVar4.s = q2f.s("100%");
                            String str2 = (String) dch.z(qjcVar, pqi.c);
                            if (str2 != null) {
                                qb5 qb5Var = new qb5(29);
                                b bVar = new b(2);
                                a aVar = new a(str2);
                                aVar.S();
                                qb5Var.E = bVar.e(aVar);
                                i49VarQ.G = qb5Var;
                            }
                            wv8 k0hVar = new k0h(lrbVar3, (qb5) i49VarQ.G, i3, i4);
                            if (z3) {
                                k0hVar = new gr1(quk.h(k0hVar));
                            }
                            return new ko5(k0hVar, z3);
                        }
                        sz6.p("SVG document is empty");
                    } else {
                        sz6.p("SVG document is empty");
                    }
                } else {
                    sz6.p("SVG document is empty");
                }
                return null;
            case 28:
                return Float.valueOf(((cz5) obj).q0(125.0f));
            default:
                return (zre) ((o0h) obj).a.g.getValue();
        }
    }
}
