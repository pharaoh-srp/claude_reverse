package io.sentry.android.replay;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends LinkedHashMap {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof io.sentry.g) {
            return super.containsKey((io.sentry.g) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof io.sentry.util.network.e) {
            return super.containsValue((io.sentry.util.network.e) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof io.sentry.g) {
            return (io.sentry.util.network.e) super.get((io.sentry.g) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof io.sentry.g) ? obj2 : (io.sentry.util.network.e) super.getOrDefault((io.sentry.g) obj, (io.sentry.util.network.e) obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof io.sentry.g) && (obj2 instanceof io.sentry.util.network.e)) {
            return super.remove((io.sentry.g) obj, (io.sentry.util.network.e) obj2);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return super.size() > 32;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof io.sentry.g) {
            return (io.sentry.util.network.e) super.remove((io.sentry.g) obj);
        }
        return null;
    }
}
