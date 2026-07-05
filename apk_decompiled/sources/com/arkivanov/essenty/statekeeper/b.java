package com.arkivanov.essenty.statekeeper;

import defpackage.ju5;
import defpackage.mr9;
import defpackage.qwk;
import defpackage.s06;
import defpackage.znf;
import defpackage.zy7;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final Map a;
    public final HashMap b;

    public b(SerializableContainer serializableContainer) {
        DefaultStateKeeperDispatcher$SavedState defaultStateKeeperDispatcher$SavedState;
        this.a = (serializableContainer == null || (defaultStateKeeperDispatcher$SavedState = (DefaultStateKeeperDispatcher$SavedState) serializableContainer.consume(DefaultStateKeeperDispatcher$SavedState.Companion.serializer())) == null) ? null : defaultStateKeeperDispatcher$SavedState.getMap();
        this.b = new HashMap();
    }

    public final Object a(String str, s06 s06Var) {
        SerializableContainer serializableContainer;
        s06Var.getClass();
        Map map = this.a;
        if (map == null || (serializableContainer = (SerializableContainer) map.remove(str)) == null) {
            return null;
        }
        return serializableContainer.consume(s06Var);
    }

    public final void b(String str, znf znfVar, zy7 zy7Var) {
        znfVar.getClass();
        HashMap map = this.b;
        if (map.containsKey(str)) {
            mr9.f("Another supplier is already registered with the key: ".concat(str));
        } else {
            map.put(str, new ju5(znfVar, zy7Var));
        }
    }

    public final SerializableContainer c() {
        Map map = this.a;
        Map linkedHashMap = map != null ? new LinkedHashMap(map) : new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            String str = (String) entry.getKey();
            ju5 ju5Var = (ju5) entry.getValue();
            Object objA = ju5Var.b.a();
            SerializableContainer serializableContainerC = objA != null ? qwk.c(objA, ju5Var.a) : null;
            if (serializableContainerC != null) {
                linkedHashMap.put(str, serializableContainerC);
            }
        }
        return qwk.c(new DefaultStateKeeperDispatcher$SavedState(linkedHashMap), DefaultStateKeeperDispatcher$SavedState.Companion.serializer());
    }
}
