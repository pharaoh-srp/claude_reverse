package com.squareup.wire;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.moshi.JsonDataException;
import com.squareup.wire.internal.JsonFormatter;
import com.squareup.wire.internal.JsonIntegration;
import defpackage.ci9;
import defpackage.gg9;
import defpackage.jj9;
import defpackage.mdj;
import defpackage.prb;
import defpackage.spi;
import defpackage.sq6;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0001:\u0003\u0019\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00022\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/squareup/wire/MoshiJsonIntegration;", "Lcom/squareup/wire/internal/JsonIntegration;", "Lprb;", "Lgg9;", "", "<init>", "()V", "framework", "Ljava/lang/reflect/Type;", "type", "frameworkAdapter", "(Lprb;Ljava/lang/reflect/Type;)Lgg9;", "elementAdapter", "listAdapter", "(Lgg9;)Lgg9;", "Lcom/squareup/wire/internal/JsonFormatter;", "keyFormatter", "valueAdapter", "mapAdapter", "(Lprb;Lcom/squareup/wire/internal/JsonFormatter;Lgg9;)Lgg9;", "structAdapter", "(Lprb;)Lgg9;", "jsonStringAdapter", "formatterAdapter", "(Lcom/squareup/wire/internal/JsonFormatter;)Lgg9;", "FormatterJsonAdapter", "ListJsonAdapter", "MapJsonAdapter", "wire-moshi-adapter"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class MoshiJsonIntegration extends JsonIntegration<prb, gg9> {
    public static final MoshiJsonIntegration INSTANCE = new MoshiJsonIntegration();

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/squareup/wire/MoshiJsonIntegration$FormatterJsonAdapter;", "", "T", "Lgg9;", "Lcom/squareup/wire/internal/JsonFormatter;", "formatter", "<init>", "(Lcom/squareup/wire/internal/JsonFormatter;)V", "Ljj9;", "writer", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "toJson", "(Ljj9;Ljava/lang/Object;)V", "Lci9;", "reader", "fromJson", "(Lci9;)Ljava/lang/Object;", "Lcom/squareup/wire/internal/JsonFormatter;", "wire-moshi-adapter"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class FormatterJsonAdapter<T> extends gg9 {
        private final JsonFormatter<T> formatter;

        public FormatterJsonAdapter(JsonFormatter<T> jsonFormatter) {
            jsonFormatter.getClass();
            this.formatter = jsonFormatter;
        }

        @Override // defpackage.gg9
        public T fromJson(ci9 reader) {
            reader.getClass();
            String strNextString = reader.nextString();
            try {
                JsonFormatter<T> jsonFormatter = this.formatter;
                strNextString.getClass();
                return jsonFormatter.fromString(strNextString);
            } catch (RuntimeException unused) {
                StringBuilder sbX = sq6.x("decode failed: ", strNextString, " at path ");
                sbX.append(reader.c());
                throw new JsonDataException(sbX.toString());
            }
        }

        @Override // defpackage.gg9
        public void toJson(jj9 writer, T value) {
            writer.getClass();
            JsonFormatter<T> jsonFormatter = this.formatter;
            value.getClass();
            Object stringOrNumber = jsonFormatter.toStringOrNumber(value);
            if (stringOrNumber instanceof Number) {
                writer.l0((Number) stringOrNumber);
            } else {
                stringOrNumber.getClass();
                writer.r0((String) stringOrNumber);
            }
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/squareup/wire/MoshiJsonIntegration$ListJsonAdapter;", "T", "Lgg9;", "", "single", "<init>", "(Lgg9;)V", "Lci9;", "reader", "fromJson", "(Lci9;)Ljava/util/List;", "Ljj9;", "writer", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "toJson", "(Ljj9;Ljava/util/List;)V", "Lgg9;", "wire-moshi-adapter"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class ListJsonAdapter<T> extends gg9 {
        private final gg9 single;

        public ListJsonAdapter(gg9 gg9Var) {
            gg9Var.getClass();
            this.single = gg9Var;
        }

        @Override // defpackage.gg9
        public List<T> fromJson(ci9 reader) {
            reader.getClass();
            ArrayList arrayList = new ArrayList();
            reader.beginArray();
            while (reader.hasNext()) {
                arrayList.add(this.single.fromJson(reader));
            }
            reader.endArray();
            return arrayList;
        }

        @Override // defpackage.gg9
        public void toJson(jj9 writer, List<? extends T> value) {
            writer.getClass();
            writer.c();
            value.getClass();
            Iterator<? extends T> it = value.iterator();
            while (it.hasNext()) {
                this.single.toJson(writer, it.next());
            }
            writer.f();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/squareup/wire/MoshiJsonIntegration$MapJsonAdapter;", "", "K", "V", "Lgg9;", "", "Lcom/squareup/wire/internal/JsonFormatter;", "keyFormatter", "valueAdapter", "<init>", "(Lcom/squareup/wire/internal/JsonFormatter;Lgg9;)V", "Lci9;", "reader", "fromJson", "(Lci9;)Ljava/util/Map;", "Ljj9;", "writer", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "toJson", "(Ljj9;Ljava/util/Map;)V", "Lcom/squareup/wire/internal/JsonFormatter;", "Lgg9;", "wire-moshi-adapter"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class MapJsonAdapter<K, V> extends gg9 {
        private final JsonFormatter<K> keyFormatter;
        private final gg9 valueAdapter;

        public MapJsonAdapter(JsonFormatter<K> jsonFormatter, gg9 gg9Var) {
            jsonFormatter.getClass();
            gg9Var.getClass();
            this.keyFormatter = jsonFormatter;
            this.valueAdapter = gg9Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.gg9
        public Map<K, V> fromJson(ci9 reader) {
            reader.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            reader.beginObject();
            while (reader.hasNext()) {
                String strNextName = reader.nextName();
                JsonFormatter<K> jsonFormatter = this.keyFormatter;
                strNextName.getClass();
                K kFromString = jsonFormatter.fromString(strNextName);
                kFromString.getClass();
                Object objFromJson = this.valueAdapter.fromJson(reader);
                objFromJson.getClass();
                linkedHashMap.put(kFromString, objFromJson);
            }
            reader.endObject();
            return linkedHashMap;
        }

        @Override // defpackage.gg9
        public void toJson(jj9 writer, Map<K, ? extends V> value) {
            writer.getClass();
            writer.d();
            value.getClass();
            for (Map.Entry<K, ? extends V> entry : value.entrySet()) {
                K key = entry.getKey();
                V value2 = entry.getValue();
                writer.n(this.keyFormatter.toStringOrNumber(key).toString());
                this.valueAdapter.toJson(writer, value2);
            }
            writer.i();
        }
    }

    private MoshiJsonIntegration() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.internal.JsonIntegration
    public gg9 formatterAdapter(JsonFormatter<?> jsonStringAdapter) {
        jsonStringAdapter.getClass();
        gg9 gg9VarNullSafe = new FormatterJsonAdapter(jsonStringAdapter).nullSafe();
        gg9VarNullSafe.getClass();
        return gg9VarNullSafe;
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public gg9 frameworkAdapter(prb framework, Type type) {
        framework.getClass();
        type.getClass();
        gg9 gg9VarNullSafe = framework.b(type, spi.a, null).nullSafe();
        gg9VarNullSafe.getClass();
        return gg9VarNullSafe;
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public gg9 listAdapter(gg9 elementAdapter) {
        elementAdapter.getClass();
        gg9 gg9VarNullSafe = new ListJsonAdapter(elementAdapter).nullSafe();
        gg9VarNullSafe.getClass();
        return gg9VarNullSafe;
    }

    /* JADX INFO: renamed from: mapAdapter, reason: avoid collision after fix types in other method */
    public gg9 mapAdapter2(prb framework, JsonFormatter<?> keyFormatter, gg9 valueAdapter) {
        framework.getClass();
        keyFormatter.getClass();
        valueAdapter.getClass();
        gg9 gg9VarNullSafe = new MapJsonAdapter(keyFormatter, valueAdapter).nullSafe();
        gg9VarNullSafe.getClass();
        return gg9VarNullSafe;
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public gg9 structAdapter(prb framework) {
        framework.getClass();
        gg9 gg9VarNullSafe = framework.b(Object.class, spi.a, null).serializeNulls().nullSafe();
        gg9VarNullSafe.getClass();
        return gg9VarNullSafe;
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public /* bridge */ /* synthetic */ gg9 formatterAdapter(JsonFormatter jsonFormatter) {
        return formatterAdapter((JsonFormatter<?>) jsonFormatter);
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public /* bridge */ /* synthetic */ gg9 mapAdapter(prb prbVar, JsonFormatter jsonFormatter, gg9 gg9Var) {
        return mapAdapter2(prbVar, (JsonFormatter<?>) jsonFormatter, gg9Var);
    }
}
