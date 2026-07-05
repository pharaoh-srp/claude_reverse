package com.squareup.wire;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import defpackage.a79;
import defpackage.b79;
import defpackage.cpc;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.nai;
import defpackage.nm6;
import defpackage.qo0;
import defpackage.w44;
import defpackage.wig;
import defpackage.x44;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001#B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR.\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR4\u0010\"\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001b0\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lcom/squareup/wire/KotlinConstructorBuilder;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/lang/Class;", "messageType", "<init>", "(Ljava/lang/Class;)V", "Lcom/squareup/wire/WireField;", "field", "Liei;", "clobberOtherIsOneOfs", "(Lcom/squareup/wire/WireField;)V", "", "Lcom/squareup/wire/KotlinConstructorBuilder$ProtoField;", "declaredProtoFields", "(Ljava/lang/Class;)Ljava/util/List;", "", ExperienceToggle.DEFAULT_PARAM_KEY, "set", "(Lcom/squareup/wire/WireField;Ljava/lang/Object;)V", "get", "(Lcom/squareup/wire/WireField;)Ljava/lang/Object;", "build", "()Lcom/squareup/wire/Message;", "Ljava/lang/Class;", "", "", "Lcpc;", "fieldValueMap", "Ljava/util/Map;", "", "repeatedFieldValueMap", "mapFieldKeyValueMap", "ProtoField", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class KotlinConstructorBuilder<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message.Builder<M, B> {
    private final Map<Integer, cpc> fieldValueMap;
    private final Map<Integer, cpc> mapFieldKeyValueMap;
    private final Class<M> messageType;
    private final Map<Integer, cpc> repeatedFieldValueMap;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/squareup/wire/KotlinConstructorBuilder$ProtoField;", "", "type", "Ljava/lang/Class;", "wireField", "Lcom/squareup/wire/WireField;", "<init>", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)V", "getType", "()Ljava/lang/Class;", "getWireField", "()Lcom/squareup/wire/WireField;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class ProtoField {
        private final Class<?> type;
        private final WireField wireField;

        public ProtoField(Class<?> cls, WireField wireField) {
            cls.getClass();
            wireField.getClass();
            this.type = cls;
            this.wireField = wireField;
        }

        public final Class<?> getType() {
            return this.type;
        }

        public final WireField getWireField() {
            return this.wireField;
        }
    }

    public KotlinConstructorBuilder(Class<M> cls) {
        cls.getClass();
        this.messageType = cls;
        int length = cls.getDeclaredFields().length;
        this.fieldValueMap = new LinkedHashMap(length);
        this.repeatedFieldValueMap = new LinkedHashMap(length);
        this.mapFieldKeyValueMap = new LinkedHashMap(length);
    }

    private final void clobberOtherIsOneOfs(WireField field) {
        Collection<cpc> collectionValues = this.fieldValueMap.values();
        ArrayList arrayList = new ArrayList(x44.y(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add((WireField) ((cpc) it.next()).E);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            WireField wireField = (WireField) obj;
            if (x44.r(wireField.oneofName(), field.oneofName()) && wireField.tag() != field.tag()) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.fieldValueMap.remove(Integer.valueOf(((WireField) it2.next()).tag()));
        }
    }

    private final List<ProtoField> declaredProtoFields(Class<M> cls) {
        ProtoField protoField;
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            declaredAnnotations.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : declaredAnnotations) {
                if (annotation instanceof WireField) {
                    arrayList2.add(annotation);
                }
            }
            WireField wireField = (WireField) w44.N0(arrayList2);
            if (wireField != null) {
                Class<?> type = field.getType();
                type.getClass();
                protoField = new ProtoField(type, wireField);
            } else {
                protoField = null;
            }
            if (protoField != null) {
                arrayList.add(protoField);
            }
        }
        return w44.i1(arrayList, new Comparator() { // from class: com.squareup.wire.KotlinConstructorBuilder$declaredProtoFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t).getWireField().schemaIndex()).compareTo(Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t2).getWireField().schemaIndex()));
            }
        });
    }

    @Override // com.squareup.wire.Message.Builder
    public M build() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        List<ProtoField> listDeclaredProtoFields = declaredProtoFields(this.messageType);
        qo0 qo0Var = new qo0();
        Iterator<ProtoField> it = listDeclaredProtoFields.iterator();
        while (it.hasNext()) {
            qo0Var.addLast(it.next());
        }
        List<ProtoField> list = listDeclaredProtoFields;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ProtoField) it2.next()).getType());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<M> cls = this.messageType;
        wig wigVar = new wig(2);
        wigVar.b(clsArr);
        wigVar.a(ByteString.class);
        ArrayList arrayList2 = wigVar.a;
        Constructor<M> declaredConstructor = cls.getDeclaredConstructor((Class[]) arrayList2.toArray(new Class[arrayList2.size()]));
        b79 b79Var = new b79(0, clsArr.length, 1);
        ArrayList arrayList3 = new ArrayList(x44.y(b79Var, 10));
        Iterator it3 = b79Var.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((a79) it3).nextInt() == listDeclaredProtoFields.size() ? buildUnknownFields() : get(((ProtoField) qo0Var.removeFirst()).getWireField()));
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        M mNewInstance = declaredConstructor.newInstance(Arrays.copyOf(array, array.length));
        mNewInstance.getClass();
        return mNewInstance;
    }

    public final Object get(WireField field) {
        List list;
        Map map;
        field.getClass();
        if (KotlinConstructorBuilderKt.isMap(field)) {
            cpc cpcVar = this.mapFieldKeyValueMap.get(Integer.valueOf(field.tag()));
            return (cpcVar == null || (map = (Map) cpcVar.F) == null) ? nm6.E : map;
        }
        if (field.label().isRepeated()) {
            cpc cpcVar2 = this.repeatedFieldValueMap.get(Integer.valueOf(field.tag()));
            return (cpcVar2 == null || (list = (List) cpcVar2.F) == null) ? lm6.E : list;
        }
        cpc cpcVar3 = this.fieldValueMap.get(Integer.valueOf(field.tag()));
        Object obj = cpcVar3 != null ? cpcVar3.F : null;
        return (obj == null && field.label() == WireField.Label.OMIT_IDENTITY) ? ProtoAdapter.INSTANCE.get(field.adapter()).getIdentity() : obj;
    }

    public final void set(WireField field, Object value) {
        field.getClass();
        if (KotlinConstructorBuilderKt.isMap(field)) {
            Map<Integer, cpc> map = this.mapFieldKeyValueMap;
            Integer numValueOf = Integer.valueOf(field.tag());
            value.getClass();
            map.put(numValueOf, new cpc(field, nai.l(value)));
            return;
        }
        if (field.label().isRepeated()) {
            Map<Integer, cpc> map2 = this.repeatedFieldValueMap;
            Integer numValueOf2 = Integer.valueOf(field.tag());
            value.getClass();
            map2.put(numValueOf2, new cpc(field, nai.k(value)));
            return;
        }
        this.fieldValueMap.put(Integer.valueOf(field.tag()), new cpc(field, value));
        if (value == null || !field.label().isOneOf()) {
            return;
        }
        clobberOtherIsOneOfs(field);
    }
}
