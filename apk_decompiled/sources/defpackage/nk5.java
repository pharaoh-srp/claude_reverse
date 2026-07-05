package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.EventType;
import com.segment.analytics.kotlin.core.IdentifyEvent;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.TrackEvent;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes.dex */
public final class nk5 implements n7d {
    public final /* synthetic */ int E;
    public gx F;

    public nk5(qk5 qk5Var) {
        this.E = 0;
    }

    @Override // defpackage.n7d
    public final BaseEvent a(BaseEvent baseEvent) {
        int i = this.E;
        baseEvent.getClass();
        switch (i) {
            case 0:
                if (baseEvent instanceof TrackEvent) {
                    TrackEvent trackEvent = (TrackEvent) baseEvent;
                    String event = trackEvent.getEvent();
                    LinkedHashMap linkedHashMapM = kxk.M(trackEvent.getProperties());
                    event.getClass();
                    if (kj5.b()) {
                        t78.a(kj5.a(null)).t(oxe.J, event, linkedHashMapM);
                    }
                }
                break;
            case 1:
                LinkedHashMap linkedHashMapT0 = sta.t0(baseEvent.getContext());
                linkedHashMapT0.put("ip", ch9.c("REDACTED"));
                linkedHashMapT0.remove("network");
                linkedHashMapT0.remove("timezone");
                linkedHashMapT0.remove("screen");
                linkedHashMapT0.remove("userAgent");
                if (linkedHashMapT0.containsKey("device")) {
                    Object obj = linkedHashMapT0.get("device");
                    obj.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap((JsonObject) obj);
                    linkedHashMap.remove("id");
                    linkedHashMapT0.put("device", new JsonObject(linkedHashMap));
                }
                baseEvent.setContext(new JsonObject(linkedHashMapT0));
                break;
            default:
                if (baseEvent.getType() == EventType.Identify) {
                    e().I.b = baseEvent.getUserId();
                    wmi wmiVar = e().I;
                    String anonymousId = baseEvent.getAnonymousId();
                    wmiVar.getClass();
                    anonymousId.getClass();
                    wmiVar.a = anonymousId;
                    e().I.c = ((IdentifyEvent) baseEvent).getTraits();
                } else if (baseEvent.getType() != EventType.Alias) {
                    if (e().I.b != null) {
                        baseEvent.setUserId(String.valueOf(e().I.b));
                    }
                    if (e().I.a != null) {
                        baseEvent.setAnonymousId(e().I.a.toString());
                    }
                } else {
                    wmi wmiVar2 = e().I;
                    String anonymousId2 = baseEvent.getAnonymousId();
                    wmiVar2.getClass();
                    anonymousId2.getClass();
                    wmiVar2.a = anonymousId2;
                }
                break;
        }
        return baseEvent;
    }

    @Override // defpackage.n7d
    public final void b(gx gxVar) {
        switch (this.E) {
            case 0:
                d(gxVar);
                break;
            case 1:
                d(gxVar);
                break;
            default:
                d(gxVar);
                break;
        }
    }

    @Override // defpackage.n7d
    public final void c(Settings settings, int i) {
        switch (this.E) {
            case 0:
                mwa.X(settings, i);
                break;
            case 1:
                mwa.X(settings, i);
                break;
            default:
                mwa.X(settings, i);
                break;
        }
    }

    public final void d(gx gxVar) {
        switch (this.E) {
            case 0:
                this.F = gxVar;
                break;
            case 1:
                this.F = gxVar;
                break;
            default:
                this.F = gxVar;
                break;
        }
    }

    @Override // defpackage.n7d
    public final gx e() {
        switch (this.E) {
            case 0:
                gx gxVar = this.F;
                if (gxVar != null) {
                    return gxVar;
                }
                x44.o0("analytics");
                throw null;
            case 1:
                gx gxVar2 = this.F;
                if (gxVar2 != null) {
                    return gxVar2;
                }
                x44.o0("analytics");
                throw null;
            default:
                gx gxVar3 = this.F;
                if (gxVar3 != null) {
                    return gxVar3;
                }
                x44.o0("analytics");
                throw null;
        }
    }

    @Override // defpackage.n7d
    public final m7d getType() {
        switch (this.E) {
            case 0:
                return m7d.H;
            case 1:
                return m7d.F;
            default:
                return m7d.E;
        }
    }

    public /* synthetic */ nk5(int i) {
        this.E = i;
    }
}
