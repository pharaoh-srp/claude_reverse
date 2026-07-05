package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import defpackage.bz7;
import defpackage.ez1;
import defpackage.ide;
import defpackage.iei;
import defpackage.mdj;
import defpackage.mk4;
import defpackage.mm9;
import defpackage.mq5;
import defpackage.nai;
import defpackage.om9;
import defpackage.pl9;
import defpackage.py3;
import defpackage.pz7;
import defpackage.qm9;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 O*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\u0001OBI\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J!\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00160\u001e2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J1\u0010\"\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00140!2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00140!2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u001a\u00107\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00104R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00102R\u0014\u0010?\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00102R\u001a\u0010@\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R(\u0010B\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00160\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010F\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00140!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0018\u0010J\u001a\u0006\u0012\u0002\b\u00030G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0018\u0010L\u001a\u0006\u0012\u0002\b\u00030G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0014\u0010M\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010)R\u0014\u0010N\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010)¨\u0006P"}, d2 = {"Lcom/squareup/wire/internal/FieldBinding;", "Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "Lcom/squareup/wire/WireField;", "wireField", "Ljava/lang/Class;", "messageType", "Ljava/lang/reflect/Field;", "messageField", "builderType", "", "writeIdentityValues", "Ljava/lang/ClassLoader;", "classLoader", "<init>", "(Lcom/squareup/wire/WireField;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/Class;ZLjava/lang/ClassLoader;)V", "builder", "", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "(Lcom/squareup/wire/Message$Builder;Ljava/lang/Object;)V", "set", "message", "get", "(Lcom/squareup/wire/Message;)Ljava/lang/Object;", "getFromBuilder", "(Lcom/squareup/wire/Message$Builder;)Ljava/lang/Object;", "Lkotlin/Function2;", "getBuilderSetter", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)Lpz7;", "Lkotlin/Function1;", "getBuilderGetter", "(Ljava/lang/Class;Lcom/squareup/wire/WireField;)Lbz7;", "getInstanceGetter", "(Ljava/lang/Class;)Lbz7;", "Ljava/lang/reflect/Field;", "Z", "getWriteIdentityValues", "()Z", "Ljava/lang/ClassLoader;", "Lcom/squareup/wire/WireField$Label;", "label", "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "wireFieldJsonName", "getWireFieldJsonName", "declaredName", "getDeclaredName", "", "tag", "I", "getTag", "()I", "keyAdapterString", "adapterString", "redacted", "getRedacted", "builderSetter", "Lpz7;", "builderGetter", "Lbz7;", "instanceGetter", "Lcom/squareup/wire/ProtoAdapter;", "getKeyAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "keyAdapter", "getSingleAdapter", "singleAdapter", "isMap", "isMessage", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    private static final ide IS_GETTER_FIELD_NAME_REGEX = new ide("^is[^a-z].*$");
    private final String adapterString;
    private final bz7 builderGetter;
    private final pz7 builderSetter;
    private final ClassLoader classLoader;
    private final String declaredName;
    private final bz7 instanceGetter;
    private final String keyAdapterString;
    private final WireField.Label label;
    private final Field messageField;
    private final String name;
    private final boolean redacted;
    private final int tag;
    private final String wireFieldJsonName;
    private final boolean writeIdentityValues;

    public FieldBinding(WireField wireField, Class<M> cls, Field field, Class<B> cls2, boolean z, ClassLoader classLoader) {
        String strDeclaredName;
        wireField.getClass();
        cls.getClass();
        field.getClass();
        cls2.getClass();
        this.messageField = field;
        this.writeIdentityValues = z;
        this.classLoader = classLoader;
        this.label = wireField.label();
        String name = field.getName();
        name.getClass();
        this.name = name;
        this.wireFieldJsonName = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            strDeclaredName = field.getName();
            strDeclaredName.getClass();
        } else {
            strDeclaredName = wireField.declaredName();
        }
        this.declaredName = strDeclaredName;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.builderSetter = getBuilderSetter(cls2, wireField);
        this.builderGetter = getBuilderGetter(cls2, wireField);
        this.instanceGetter = getInstanceGetter(cls);
    }

    private final bz7 getBuilderGetter(Class<?> builderType, WireField wireField) {
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new py3(19, wireField);
        }
        try {
            return new py3(20, builderType.getField(getName()));
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + builderType.getName() + '.' + this.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$3(WireField wireField, Message.Builder builder) {
        builder.getClass();
        return ((KotlinConstructorBuilder) builder).get(wireField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$4(Field field, Message.Builder builder) {
        builder.getClass();
        return field.get(builder);
    }

    private final pz7 getBuilderSetter(Class<?> builderType, WireField wireField) {
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new mk4(17, wireField);
        }
        if (!wireField.label().isOneOf()) {
            try {
                return new mk4(19, builderType.getField(getName()));
            } catch (NoSuchFieldException unused) {
                throw new AssertionError("No builder field " + builderType.getName() + '.' + this.getName());
            }
        }
        Class<?> type = this.messageField.getType();
        try {
            return new mk4(18, builderType.getMethod(getName(), type));
        } catch (NoSuchMethodException unused2) {
            throw new AssertionError("No builder method " + builderType.getName() + '.' + this.getName() + '(' + type.getName() + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei getBuilderSetter$lambda$0(WireField wireField, Message.Builder builder, Object obj) {
        builder.getClass();
        ((KotlinConstructorBuilder) builder).set(wireField, obj);
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei getBuilderSetter$lambda$1(Method method, Message.Builder builder, Object obj) throws IllegalAccessException, InvocationTargetException {
        builder.getClass();
        method.invoke(builder, obj);
        return iei.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final iei getBuilderSetter$lambda$2(Field field, Message.Builder builder, Object obj) throws IllegalAccessException {
        builder.getClass();
        field.set(builder, obj);
        return iei.a;
    }

    private final bz7 getInstanceGetter(Class<M> messageType) {
        if (!Modifier.isPrivate(this.messageField.getModifiers())) {
            return new py3(22, this);
        }
        String name = this.messageField.getName();
        ide ideVar = IS_GETTER_FIELD_NAME_REGEX;
        name.getClass();
        if (!ideVar.f(name)) {
            if (name.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(name.charAt(0));
                strValueOf.getClass();
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb.append((Object) upperCase);
                sb.append(name.substring(1));
                name = sb.toString();
            }
            name = "get".concat(name);
        }
        return new py3(21, messageType.getMethod(name, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$6(Method method, Message message) {
        message.getClass();
        return method.invoke(message, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$7(FieldBinding fieldBinding, Message message) {
        message.getClass();
        return fieldBinding.messageField.get(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M message) {
        message.getClass();
        return this.instanceGetter.invoke(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.declaredName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B builder) {
        builder.getClass();
        return this.builderGetter.invoke(builder);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getKeyAdapter() {
        return ProtoAdapter.INSTANCE.get(this.keyAdapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return this.label;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.name;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.redacted;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getSingleAdapter() {
        return ProtoAdapter.INSTANCE.get(this.adapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.tag;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.wireFieldJsonName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return this.keyAdapterString.length() > 0;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        pl9 type = getSingleAdapter().getType();
        Class clsJ = type != null ? ez1.J(type) : null;
        clsJ.getClass();
        return Message.class.isAssignableFrom(clsJ);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B builder, Object value) {
        builder.getClass();
        this.builderSetter.invoke(builder, value);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B builder, Object value) {
        builder.getClass();
        value.getClass();
        if (getLabel().isRepeated()) {
            Object fromBuilder = getFromBuilder((Message.Builder) builder);
            boolean z = fromBuilder instanceof List;
            if (z && (!(fromBuilder instanceof mm9) || (fromBuilder instanceof om9))) {
                fromBuilder.getClass();
                nai.k(fromBuilder).add(value);
                return;
            } else if (z) {
                ArrayList arrayList = new ArrayList((Collection) fromBuilder);
                arrayList.add(value);
                set((Message.Builder) builder, (Object) arrayList);
                return;
            } else {
                throw new ClassCastException("Expected a list type, got " + (fromBuilder != null ? fromBuilder.getClass() : null) + '.');
            }
        }
        if (this.keyAdapterString.length() <= 0) {
            set((Message.Builder) builder, value);
            return;
        }
        Object fromBuilder2 = getFromBuilder((Message.Builder) builder);
        boolean z2 = fromBuilder2 instanceof Map;
        if (z2 && (!(fromBuilder2 instanceof mm9) || (fromBuilder2 instanceof qm9))) {
            ((Map) fromBuilder2).putAll((Map) value);
            return;
        }
        if (z2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) fromBuilder2);
            linkedHashMap.putAll((Map) value);
            set((Message.Builder) builder, (Object) linkedHashMap);
        } else {
            throw new ClassCastException("Expected a map type, got " + (fromBuilder2 != null ? fromBuilder2.getClass() : null) + '.');
        }
    }

    public /* synthetic */ FieldBinding(WireField wireField, Class cls, Field field, Class cls2, boolean z, ClassLoader classLoader, int i, mq5 mq5Var) {
        this(wireField, cls, field, cls2, z, (i & 32) != 0 ? cls.getClassLoader() : classLoader);
    }
}
