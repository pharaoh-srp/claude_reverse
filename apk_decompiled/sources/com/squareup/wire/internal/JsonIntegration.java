package com.squareup.wire.internal;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.ez1;
import defpackage.mdj;
import defpackage.pl9;
import defpackage.sz6;
import defpackage.x44;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.Base64;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\b()*+,-./B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0001H&¢\u0006\u0002\u0010\rJ)\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00002\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0011\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rJ\u0019\u0010\u0014\u001a\u00028\u00012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0010H&¢\u0006\u0002\u0010\u0016JA\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018\"\b\b\u0002\u0010\u0019*\u00020\u0003\"\b\b\u0003\u0010\u001a*\u00020\u00032\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001a0\u001c2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\u001dJE\u0010\u001e\u001a\u00028\u0001\"\b\b\u0002\u0010\u0019*\u00020\u0003\"\b\b\u0003\u0010\u001a*\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001a0\"H\u0002¢\u0006\u0002\u0010#J\"\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020 2\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&H\u0002J\u0018\u0010'\u001a\u0006\u0012\u0002\b\u00030\u00102\n\u0010%\u001a\u0006\u0012\u0002\b\u00030&H\u0002¨\u00060"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration;", "F", "A", "", "<init>", "()V", "frameworkAdapter", "framework", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "listAdapter", "elementAdapter", "(Ljava/lang/Object;)Ljava/lang/Object;", "mapAdapter", "keyFormatter", "Lcom/squareup/wire/internal/JsonFormatter;", "valueAdapter", "(Ljava/lang/Object;Lcom/squareup/wire/internal/JsonFormatter;Ljava/lang/Object;)Ljava/lang/Object;", "structAdapter", "formatterAdapter", "jsonStringAdapter", "(Lcom/squareup/wire/internal/JsonFormatter;)Ljava/lang/Object;", "jsonAdapters", "", "M", "B", "adapter", "Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "(Lcom/squareup/wire/internal/RuntimeMessageAdapter;Ljava/lang/Object;)Ljava/util/List;", "jsonAdapter", "syntax", "Lcom/squareup/wire/Syntax;", "field", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "(Ljava/lang/Object;Lcom/squareup/wire/Syntax;Lcom/squareup/wire/internal/FieldOrOneOfBinding;)Ljava/lang/Object;", "jsonFormatter", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "mapKeyJsonFormatter", "UnsignedLongAsNumberJsonFormatter", "UnsignedLongAsStringJsonFormatter", "LongAsStringJsonFormatter", "UnsignedIntAsNumberJsonFormatter", "UnsignedIntAsStringJsonFormatter", "IntAsStringJsonFormatter", "ByteStringJsonFormatter", "StringJsonFormatter", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public abstract class JsonIntegration<F, A> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$ByteStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "Lokio/ByteString;", "<init>", "()V", "toStringOrNumber", "", ExperienceToggle.DEFAULT_PARAM_KEY, "fromString", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class ByteStringJsonFormatter implements JsonFormatter<ByteString> {
        public static final ByteStringJsonFormatter INSTANCE = new ByteStringJsonFormatter();

        private ByteStringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public ByteString fromString(String value) {
            value.getClass();
            ByteString byteString = ByteString.H;
            byte[] bArrA = Base64.a(value);
            if (bArrA != null) {
                return new ByteString(bArrA);
            }
            return null;
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String toStringOrNumber(ByteString value) {
            value.getClass();
            return value.a();
        }
    }

    private final <M, B> A jsonAdapter(F framework, Syntax syntax, FieldOrOneOfBinding<M, B> field) {
        A aFrameworkAdapter;
        if (field.getSingleAdapter().isStruct$wire_runtime()) {
            return structAdapter(framework);
        }
        JsonFormatter<?> jsonFormatter = jsonFormatter(syntax, field.getSingleAdapter());
        if (jsonFormatter != null) {
            aFrameworkAdapter = formatterAdapter(jsonFormatter);
        } else {
            pl9 type = field.getSingleAdapter().getType();
            Class clsJ = type != null ? ez1.J(type) : null;
            clsJ.getClass();
            aFrameworkAdapter = frameworkAdapter(framework, clsJ);
        }
        return field.getLabel().isRepeated() ? listAdapter(aFrameworkAdapter) : field.isMap() ? mapAdapter(framework, mapKeyJsonFormatter(field.getKeyAdapter()), aFrameworkAdapter) : aFrameworkAdapter;
    }

    private final JsonFormatter<?> jsonFormatter(Syntax syntax, ProtoAdapter<?> protoAdapter) {
        if (x44.r(protoAdapter, ProtoAdapter.BYTES) || x44.r(protoAdapter, ProtoAdapter.BYTES_VALUE)) {
            return ByteStringJsonFormatter.INSTANCE;
        }
        if (x44.r(protoAdapter, ProtoAdapter.DURATION)) {
            return DurationJsonFormatter.INSTANCE;
        }
        if (x44.r(protoAdapter, ProtoAdapter.INSTANT)) {
            return InstantJsonFormatter.INSTANCE;
        }
        if (protoAdapter instanceof EnumAdapter) {
            return new EnumJsonFormatter((EnumAdapter) protoAdapter);
        }
        if (syntax == Syntax.PROTO_2) {
            if (x44.r(protoAdapter, ProtoAdapter.UINT64) || x44.r(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
                return UnsignedLongAsNumberJsonFormatter.INSTANCE;
            }
            return null;
        }
        if (x44.r(protoAdapter, ProtoAdapter.UINT32) || x44.r(protoAdapter, ProtoAdapter.FIXED32) || x44.r(protoAdapter, ProtoAdapter.UINT32_VALUE)) {
            return UnsignedIntAsNumberJsonFormatter.INSTANCE;
        }
        if (x44.r(protoAdapter, ProtoAdapter.INT64) || x44.r(protoAdapter, ProtoAdapter.SFIXED64) || x44.r(protoAdapter, ProtoAdapter.SINT64) || x44.r(protoAdapter, ProtoAdapter.INT64_VALUE)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (x44.r(protoAdapter, ProtoAdapter.FIXED64) || x44.r(protoAdapter, ProtoAdapter.UINT64) || x44.r(protoAdapter, ProtoAdapter.UINT64_VALUE)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        return null;
    }

    private final JsonFormatter<?> mapKeyJsonFormatter(ProtoAdapter<?> protoAdapter) {
        if (x44.r(protoAdapter, ProtoAdapter.STRING)) {
            return StringJsonFormatter.INSTANCE;
        }
        if (x44.r(protoAdapter, ProtoAdapter.INT32) || x44.r(protoAdapter, ProtoAdapter.SINT32) || x44.r(protoAdapter, ProtoAdapter.SFIXED32)) {
            return IntAsStringJsonFormatter.INSTANCE;
        }
        if (x44.r(protoAdapter, ProtoAdapter.FIXED32) || x44.r(protoAdapter, ProtoAdapter.UINT32)) {
            return UnsignedIntAsStringJsonFormatter.INSTANCE;
        }
        if (x44.r(protoAdapter, ProtoAdapter.INT64) || x44.r(protoAdapter, ProtoAdapter.SFIXED64) || x44.r(protoAdapter, ProtoAdapter.SINT64)) {
            return LongAsStringJsonFormatter.INSTANCE;
        }
        if (x44.r(protoAdapter, ProtoAdapter.FIXED64) || x44.r(protoAdapter, ProtoAdapter.UINT64)) {
            return UnsignedLongAsStringJsonFormatter.INSTANCE;
        }
        sz6.k("Unexpected map key type: ", protoAdapter.getType());
        return null;
    }

    public abstract A formatterAdapter(JsonFormatter<?> jsonStringAdapter);

    public abstract A frameworkAdapter(F framework, Type type);

    public final <M, B> List<A> jsonAdapters(RuntimeMessageAdapter<M, B> adapter, F framework) {
        adapter.getClass();
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) adapter.getFields().values().toArray(new FieldOrOneOfBinding[0]);
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(jsonAdapter(framework, adapter.getSyntax(), fieldOrOneOfBinding));
        }
        return arrayList;
    }

    public abstract A listAdapter(A elementAdapter);

    public abstract A mapAdapter(F framework, JsonFormatter<?> keyFormatter, A valueAdapter);

    public abstract A structAdapter(F framework);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$StringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "toStringOrNumber", ExperienceToggle.DEFAULT_PARAM_KEY, "fromString", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class StringJsonFormatter implements JsonFormatter<String> {
        public static final StringJsonFormatter INSTANCE = new StringJsonFormatter();

        private StringJsonFormatter() {
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String fromString(String value) {
            value.getClass();
            return value;
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public String toStringOrNumber(String value) {
            value.getClass();
            return value;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$IntAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "fromString", ExperienceToggle.DEFAULT_PARAM_KEY, "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toStringOrNumber", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class IntAsStringJsonFormatter implements JsonFormatter<Integer> {
        public static final IntAsStringJsonFormatter INSTANCE = new IntAsStringJsonFormatter();

        private IntAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            value.getClass();
            return Integer.valueOf(Integer.parseInt(value));
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }

        public String toStringOrNumber(int value) {
            return String.valueOf(value);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$LongAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "toStringOrNumber", "", ExperienceToggle.DEFAULT_PARAM_KEY, "fromString", "(Ljava/lang/String;)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class LongAsStringJsonFormatter implements JsonFormatter<Long> {
        public static final LongAsStringJsonFormatter INSTANCE = new LongAsStringJsonFormatter();

        private LongAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            long jLongValueExact;
            value.getClass();
            try {
                jLongValueExact = Long.parseLong(value);
            } catch (Exception unused) {
                jLongValueExact = new BigDecimal(value).longValueExact();
            }
            return Long.valueOf(jLongValueExact);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l) {
            return toStringOrNumber(l.longValue());
        }

        public String toStringOrNumber(long value) {
            return String.valueOf(value);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedLongAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "toStringOrNumber", "", ExperienceToggle.DEFAULT_PARAM_KEY, "fromString", "(Ljava/lang/String;)Ljava/lang/Long;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class UnsignedLongAsStringJsonFormatter implements JsonFormatter<Long> {
        public static final UnsignedLongAsStringJsonFormatter INSTANCE = new UnsignedLongAsStringJsonFormatter();

        private UnsignedLongAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            value.getClass();
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.fromString(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l) {
            return toStringOrNumber(l.longValue());
        }

        public String toStringOrNumber(long value) {
            return UnsignedLongAsNumberJsonFormatter.INSTANCE.toStringOrNumber(value).toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedIntAsNumberJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "power32", "", "maxInt", "fromString", ExperienceToggle.DEFAULT_PARAM_KEY, "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toStringOrNumber", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class UnsignedIntAsNumberJsonFormatter implements JsonFormatter<Integer> {
        public static final UnsignedIntAsNumberJsonFormatter INSTANCE = new UnsignedIntAsNumberJsonFormatter();
        private static final long maxInt = 2147483647L;
        private static final long power32 = 4294967296L;

        private UnsignedIntAsNumberJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            value.getClass();
            long j = (long) Double.parseDouble(value);
            if (j >= maxInt) {
                j -= power32;
            }
            return Integer.valueOf((int) j);
        }

        public Object toStringOrNumber(int value) {
            return value < 0 ? Long.valueOf(((long) value) + power32) : Integer.valueOf(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedIntAsStringJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "power32", "", "fromString", ExperienceToggle.DEFAULT_PARAM_KEY, "", "(Ljava/lang/String;)Ljava/lang/Integer;", "toStringOrNumber", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class UnsignedIntAsStringJsonFormatter implements JsonFormatter<Integer> {
        public static final UnsignedIntAsStringJsonFormatter INSTANCE = new UnsignedIntAsStringJsonFormatter();
        private static final long power32 = 4294967296L;

        private UnsignedIntAsStringJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Integer fromString(String value) {
            value.getClass();
            return Integer.valueOf((int) Long.parseLong(value));
        }

        public Object toStringOrNumber(int value) {
            return value < 0 ? String.valueOf(((long) value) + power32) : String.valueOf(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Integer num) {
            return toStringOrNumber(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/squareup/wire/internal/JsonIntegration$UnsignedLongAsNumberJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "", "<init>", "()V", "power64", "Ljava/math/BigInteger;", "maxLong", "kotlin.jvm.PlatformType", "Ljava/math/BigInteger;", "fromString", ExperienceToggle.DEFAULT_PARAM_KEY, "", "(Ljava/lang/String;)Ljava/lang/Long;", "toStringOrNumber", "", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class UnsignedLongAsNumberJsonFormatter implements JsonFormatter<Long> {
        public static final UnsignedLongAsNumberJsonFormatter INSTANCE = new UnsignedLongAsNumberJsonFormatter();
        private static final BigInteger power64 = new BigInteger("18446744073709551616");
        private static final BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);

        private UnsignedLongAsNumberJsonFormatter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.internal.JsonFormatter
        public Long fromString(String value) {
            BigInteger bigInteger;
            value.getClass();
            try {
                bigInteger = new BigInteger(value);
            } catch (Exception unused) {
                bigInteger = new BigDecimal(value).toBigInteger();
            }
            return Long.valueOf(bigInteger.compareTo(maxLong) > 0 ? bigInteger.subtract(power64).longValue() : bigInteger.longValue());
        }

        public Object toStringOrNumber(long value) {
            return value < 0 ? power64.add(BigInteger.valueOf(value)) : Long.valueOf(value);
        }

        @Override // com.squareup.wire.internal.JsonFormatter
        public /* bridge */ /* synthetic */ Object toStringOrNumber(Long l) {
            return toStringOrNumber(l.longValue());
        }
    }
}
