package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.DestinationMetadata;
import com.segment.analytics.kotlin.core.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes.dex */
public final class u16 implements n7d {
    public gx E;
    public Settings F;

    @Override // defpackage.n7d
    public final BaseEvent a(BaseEvent baseEvent) {
        ArrayList arrayList;
        JsonElement jsonElement;
        CopyOnWriteArrayList<n7d> copyOnWriteArrayList;
        baseEvent.getClass();
        s8b s8bVar = (s8b) e().b().a.get(m7d.G);
        if (s8bVar == null || (copyOnWriteArrayList = s8bVar.a) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(x44.y(copyOnWriteArrayList, 10));
            for (n7d n7dVar : copyOnWriteArrayList) {
                n7dVar.getClass();
                arrayList2.add((w16) n7dVar);
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                w16 w16Var = (w16) obj;
                if (w16Var.G && !(w16Var instanceof pff)) {
                    arrayList.add(obj);
                }
            }
        }
        DestinationMetadata destinationMetadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (mq5) null);
        pwf pwfVar = new pwf();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pwfVar.add(((pff) ((w16) it.next())).J);
            }
        }
        pwf pwfVarK = sf5.k(pwfVar);
        pwf pwfVar2 = new pwf();
        for (String str : this.F.getIntegrations().keySet()) {
            if (!x44.r(str, "Segment.io") && !pwfVarK.E.containsKey(str)) {
                pwfVar2.add(str);
            }
        }
        JsonElement jsonElement2 = (JsonElement) this.F.getIntegrations().get((Object) "Segment.io");
        if (jsonElement2 != null) {
            ih9 ih9Var = dj9.a;
            JsonObject jsonObject = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
            if (jsonObject != null && (jsonElement = (JsonElement) jsonObject.get((Object) "unbundledIntegrations")) != null) {
                JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
                if (jsonArray != null) {
                    for (JsonElement jsonElement3 : jsonArray) {
                        jsonElement3.getClass();
                        String content = ((JsonPrimitive) jsonElement3).getContent();
                        if (!pwfVarK.E.containsKey(content)) {
                            pwfVar2.add(content);
                        }
                    }
                }
            }
        }
        pwf pwfVarK2 = sf5.k(pwfVar2);
        destinationMetadata.setBundledIds(lm6.E);
        destinationMetadata.setBundled(w44.p1(pwfVarK));
        destinationMetadata.setUnbundled(w44.p1(pwfVarK2));
        BaseEvent baseEventCopy = baseEvent.copy();
        baseEventCopy.set_metadata(destinationMetadata);
        return baseEventCopy;
    }

    @Override // defpackage.n7d
    public final void b(gx gxVar) {
        this.E = gxVar;
    }

    @Override // defpackage.n7d
    public final void c(Settings settings, int i) {
        settings.getClass();
        sq6.a(i);
        this.F = settings;
    }

    @Override // defpackage.n7d
    public final gx e() {
        gx gxVar = this.E;
        if (gxVar != null) {
            return gxVar;
        }
        x44.o0("analytics");
        throw null;
    }

    @Override // defpackage.n7d
    public final m7d getType() {
        return m7d.F;
    }
}
