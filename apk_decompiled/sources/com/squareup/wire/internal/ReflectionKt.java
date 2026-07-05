package com.squareup.wire.internal;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.aac;
import defpackage.f2;
import defpackage.hre;
import defpackage.jce;
import defpackage.mdj;
import defpackage.mwa;
import defpackage.pl9;
import defpackage.x44;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001at\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001aF\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a`\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u001aH\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0007\"\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0002¨\u0006\u0016"}, d2 = {"createRuntimeMessageAdapter", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "M", "B", "Lcom/squareup/wire/Message;", "Lcom/squareup/wire/Message$Builder;", "messageType", "Ljava/lang/Class;", "typeUrl", "", "syntax", "Lcom/squareup/wire/Syntax;", "classLoader", "Ljava/lang/ClassLoader;", "writeIdentityValues", "", "getKeys", "", "Lcom/squareup/wire/OneOf$Key;", "messageField", "Ljava/lang/reflect/Field;", "getBuilderType", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class ReflectionKt {
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(Class<M> cls, String str, Syntax syntax, ClassLoader classLoader, boolean z) {
        cls.getClass();
        syntax.getClass();
        Class builderType = getBuilderType(cls);
        aac aacVar = new aac(builderType, 17, cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f2 f2VarF = mwa.F(cls.getDeclaredFields());
        while (f2VarF.hasNext()) {
            Field field = (Field) f2VarF.next();
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                Class cls2 = builderType;
                Class<M> cls3 = cls;
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, cls3, field, cls2, z, classLoader));
                builderType = cls2;
            } else {
                ClassLoader classLoader2 = classLoader;
                boolean z2 = z;
                Class cls4 = builderType;
                Class<M> cls5 = cls;
                if (x44.r(field.getType(), OneOf.class)) {
                    for (OneOf.Key<?> key : getKeys(field)) {
                        linkedHashMap.put(Integer.valueOf(key.getTag()), new OneOfBinding(field, cls4, key, z2));
                    }
                }
                cls = cls5;
                builderType = cls4;
                z = z2;
                classLoader = classLoader2;
            }
        }
        Class cls6 = builderType;
        pl9 pl9VarB = jce.a.b(cls);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return new RuntimeMessageAdapter<>(new RuntimeMessageBinding(pl9VarB, cls6, aacVar, mapUnmodifiableMap, str, syntax));
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, String str, Syntax syntax, ClassLoader classLoader, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            classLoader = cls.getClassLoader();
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return createRuntimeMessageAdapter(cls, str, syntax, classLoader, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Message.Builder createRuntimeMessageAdapter$lambda$0(Class cls, Class cls2) throws IllegalAccessException, InstantiationException {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new KotlinConstructorBuilder(cls2);
        }
        Object objNewInstance = cls.newInstance();
        objNewInstance.getClass();
        return (Message.Builder) objNewInstance;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Class<B> getBuilderType(Class<M> cls) {
        Object hreVar;
        try {
            hreVar = Class.forName(cls.getName().concat("$Builder"), false, cls.getClassLoader());
            hreVar.getClass();
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (hreVar instanceof hre) {
            hreVar = null;
        }
        Class<B> cls2 = (Class) hreVar;
        return cls2 == null ? KotlinConstructorBuilder.class : cls2;
    }

    private static final <M extends Message<M, B>, B extends Message.Builder<M, B>> Set<OneOf.Key<?>> getKeys(Field field) throws IllegalAccessException, NoSuchFieldException {
        Class<?> declaringClass = field.getDeclaringClass();
        String name = field.getName();
        name.getClass();
        Field declaredField = declaringClass.getDeclaredField(Internal.boxedOneOfKeysFieldName(name));
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        obj.getClass();
        return (Set) obj;
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, boolean z, ClassLoader classLoader, int i, Object obj) {
        if ((i & 4) != 0) {
            classLoader = cls.getClassLoader();
        }
        return createRuntimeMessageAdapter(cls, z, classLoader);
    }

    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> RuntimeMessageAdapter<M, B> createRuntimeMessageAdapter(Class<M> cls, boolean z, ClassLoader classLoader) {
        cls.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INSTANCE.get(cls);
        return createRuntimeMessageAdapter(cls, protoAdapter.getTypeUrl(), protoAdapter.getSyntax(), classLoader, z);
    }
}
