package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import defpackage.ez1;
import defpackage.f2;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.mwa;
import defpackage.pl9;
import defpackage.pmf;
import defpackage.tl3;
import defpackage.x44;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/wire/internal/EnumJsonFormatter;", "E", "Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/internal/JsonFormatter;", "adapter", "Lcom/squareup/wire/EnumAdapter;", "<init>", "(Lcom/squareup/wire/EnumAdapter;)V", "stringToValue", "", "", "valueToString", "unrecognizedClassConstructor", "Ljava/lang/reflect/Constructor;", "fromString", ExperienceToggle.DEFAULT_PARAM_KEY, "(Ljava/lang/String;)Lcom/squareup/wire/WireEnum;", "toStringOrNumber", "", "(Lcom/squareup/wire/WireEnum;)Ljava/lang/Object;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class EnumJsonFormatter<E extends WireEnum> implements JsonFormatter<E> {
    private final Map<String, E> stringToValue;
    private Constructor<E> unrecognizedClassConstructor;
    private final Map<E, String> valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumJsonFormatter(EnumAdapter<E> enumAdapter) throws IllegalAccessException {
        Annotation annotation;
        enumAdapter.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        pl9 type = enumAdapter.getType();
        type.getClass();
        Class clsI = ez1.I(type);
        WireEnum[] wireEnumArr = (WireEnum[]) clsI.getEnumConstants();
        int i = 0;
        if (wireEnumArr == 0) {
            f2 f2VarF = mwa.F(clsI.getDeclaredClasses());
            while (f2VarF.hasNext()) {
                Class cls = (Class) f2VarF.next();
                String simpleName = cls.getSimpleName();
                if (!simpleName.equals("Companion")) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    declaredFields.getClass();
                    Field field = (Field) mp0.D0(declaredFields);
                    if (x44.r(field.getName(), "INSTANCE")) {
                        Object obj = field.get(null);
                        obj.getClass();
                        WireEnum wireEnum = (WireEnum) obj;
                        linkedHashMap.put(cls.getSimpleName(), wireEnum);
                        linkedHashMap.put(String.valueOf(wireEnum.getValue()), wireEnum);
                        linkedHashMap2.put(wireEnum, simpleName);
                        Annotation[] annotations = cls.getAnnotations();
                        annotations.getClass();
                        int length = annotations.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                annotation = null;
                                break;
                            }
                            annotation = annotations[i2];
                            if (annotation instanceof WireEnumConstant) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        WireEnumConstant wireEnumConstant = annotation instanceof WireEnumConstant ? (WireEnumConstant) annotation : null;
                        if (wireEnumConstant != null && wireEnumConstant.declaredName().length() > 0) {
                            linkedHashMap.put(wireEnumConstant.declaredName(), wireEnum);
                            linkedHashMap2.put(wireEnum, wireEnumConstant.declaredName());
                        }
                    } else {
                        Constructor<?>[] constructors = cls.getConstructors();
                        constructors.getClass();
                        Object objD0 = mp0.D0(constructors);
                        objD0.getClass();
                        this.unrecognizedClassConstructor = (Constructor) objD0;
                    }
                }
            }
        } else {
            while (i < wireEnumArr.length) {
                int i3 = i + 1;
                try {
                    tl3 tl3Var = wireEnumArr[i];
                    tl3Var.getClass();
                    String strName = tl3Var.name();
                    linkedHashMap.put(strName, tl3Var);
                    linkedHashMap.put(String.valueOf(tl3Var.getValue()), tl3Var);
                    linkedHashMap2.put(tl3Var, strName);
                    WireEnumConstant wireEnumConstant2 = (WireEnumConstant) clsI.getDeclaredField(strName).getAnnotation(WireEnumConstant.class);
                    if (wireEnumConstant2 != null && wireEnumConstant2.declaredName().length() > 0) {
                        linkedHashMap.put(wireEnumConstant2.declaredName(), tl3Var);
                        linkedHashMap2.put(tl3Var, wireEnumConstant2.declaredName());
                    }
                    i = i3;
                } catch (ArrayIndexOutOfBoundsException e) {
                    pmf.h(e.getMessage());
                    throw null;
                }
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public E fromString(String value) {
        value.getClass();
        E e = this.stringToValue.get(value);
        if (e != null) {
            return e;
        }
        Constructor<E> constructor = this.unrecognizedClassConstructor;
        if (constructor != null) {
            return constructor.newInstance(Integer.valueOf(Integer.parseInt(value)));
        }
        return null;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object toStringOrNumber(E value) {
        value.getClass();
        String str = this.valueToString.get(value);
        return str == null ? Integer.valueOf(value.getValue()) : str;
    }
}
