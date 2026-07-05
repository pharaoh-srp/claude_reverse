package com.pvporbit.freetype;

import defpackage.mdj;
import defpackage.x44;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0004BCDEB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJA\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\"\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f`\r2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ;\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\b2\"\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000bj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\u001aJ\u0015\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b.\u0010-J\u001d\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u00107R0\u00108\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u000bj\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R0\u0010:\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000bj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R0\u0010;\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000bj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R0\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00109R0\u0010=\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\"\u0010>\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\n\"\u0004\bA\u0010\u001a¨\u0006F"}, d2 = {"Lcom/pvporbit/freetype/MTFreeTypeMathTable;", "", "", "pointer", "Ljava/nio/ByteBuffer;", "data", "<init>", "(JLjava/nio/ByteBuffer;)V", "", "getDataSInt", "()I", "Ljava/util/HashMap;", "Lcom/pvporbit/freetype/MTFreeTypeMathTable$MathGlyphConstruction;", "Lkotlin/collections/HashMap;", "construction", "gid", "", "getVariantsForGlyph", "(Ljava/util/HashMap;I)Ljava/util/List;", "getDataRecord", "foffset", "table", "Liei;", "readmatchedtable", "(ILjava/util/HashMap;)V", "readConstants", "(I)V", "", "readCoverageTable", "(I)[Ljava/lang/Integer;", "readconstruction", "(I)Lcom/pvporbit/freetype/MTFreeTypeMathTable$MathGlyphConstruction;", "Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphAssembly;", "readassembly", "(I)Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphAssembly;", "readvariants", "", "name", "getConstant", "(Ljava/lang/String;)I", "getitalicCorrection", "(I)I", "gettopAccentAttachment", "(I)Ljava/lang/Integer;", "getVerticalVariantsForGlyph", "(I)Ljava/util/List;", "getHorizontalVariantsForGlyph", "Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphPartRecord;", "getVerticalGlyphAssemblyForGlyph", "(I)[Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphPartRecord;", "J", "getPointer", "()J", "Ljava/nio/ByteBuffer;", "getData", "()Ljava/nio/ByteBuffer;", "constants", "Ljava/util/HashMap;", "italicscorrectioninfo", "topaccentattachment", "vertglyphconstruction", "horizglyphconstruction", "minConnectorOverlap", "I", "getMinConnectorOverlap", "setMinConnectorOverlap", "MathGlyphConstruction", "MathGlyphVariantRecord", "GlyphPartRecord", "GlyphAssembly", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTFreeTypeMathTable {
    private final HashMap<String, Integer> constants;
    private final ByteBuffer data;
    private final HashMap<Integer, MathGlyphConstruction> horizglyphconstruction;
    private final HashMap<Integer, Integer> italicscorrectioninfo;
    private int minConnectorOverlap;
    private final long pointer;
    private final HashMap<Integer, Integer> topaccentattachment;
    private final HashMap<Integer, MathGlyphConstruction> vertglyphconstruction;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphAssembly;", "", "italicsCorrection", "", "partRecords", "", "Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphPartRecord;", "<init>", "(I[Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphPartRecord;)V", "getItalicsCorrection", "()I", "getPartRecords", "()[Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphPartRecord;", "[Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphPartRecord;", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class GlyphAssembly {
        private final int italicsCorrection;
        private final GlyphPartRecord[] partRecords;

        public GlyphAssembly(int i, GlyphPartRecord[] glyphPartRecordArr) {
            glyphPartRecordArr.getClass();
            this.italicsCorrection = i;
            this.partRecords = glyphPartRecordArr;
        }

        public final int getItalicsCorrection() {
            return this.italicsCorrection;
        }

        public final GlyphPartRecord[] getPartRecords() {
            return this.partRecords;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphPartRecord;", "", "glyph", "", "startConnectorLength", "endConnectorLength", "fullAdvance", "partFlags", "<init>", "(IIIII)V", "getGlyph", "()I", "getStartConnectorLength", "getEndConnectorLength", "getFullAdvance", "getPartFlags", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class GlyphPartRecord {
        private final int endConnectorLength;
        private final int fullAdvance;
        private final int glyph;
        private final int partFlags;
        private final int startConnectorLength;

        public GlyphPartRecord(int i, int i2, int i3, int i4, int i5) {
            this.glyph = i;
            this.startConnectorLength = i2;
            this.endConnectorLength = i3;
            this.fullAdvance = i4;
            this.partFlags = i5;
        }

        public final int getEndConnectorLength() {
            return this.endConnectorLength;
        }

        public final int getFullAdvance() {
            return this.fullAdvance;
        }

        public final int getGlyph() {
            return this.glyph;
        }

        public final int getPartFlags() {
            return this.partFlags;
        }

        public final int getStartConnectorLength() {
            return this.startConnectorLength;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pvporbit/freetype/MTFreeTypeMathTable$MathGlyphConstruction;", "", "assembly", "Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphAssembly;", "variants", "", "Lcom/pvporbit/freetype/MTFreeTypeMathTable$MathGlyphVariantRecord;", "<init>", "(Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphAssembly;[Lcom/pvporbit/freetype/MTFreeTypeMathTable$MathGlyphVariantRecord;)V", "getAssembly", "()Lcom/pvporbit/freetype/MTFreeTypeMathTable$GlyphAssembly;", "getVariants", "()[Lcom/pvporbit/freetype/MTFreeTypeMathTable$MathGlyphVariantRecord;", "[Lcom/pvporbit/freetype/MTFreeTypeMathTable$MathGlyphVariantRecord;", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class MathGlyphConstruction {
        private final GlyphAssembly assembly;
        private final MathGlyphVariantRecord[] variants;

        public MathGlyphConstruction(GlyphAssembly glyphAssembly, MathGlyphVariantRecord[] mathGlyphVariantRecordArr) {
            mathGlyphVariantRecordArr.getClass();
            this.assembly = glyphAssembly;
            this.variants = mathGlyphVariantRecordArr;
        }

        public final GlyphAssembly getAssembly() {
            return this.assembly;
        }

        public final MathGlyphVariantRecord[] getVariants() {
            return this.variants;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/pvporbit/freetype/MTFreeTypeMathTable$MathGlyphVariantRecord;", "", "variantGlyph", "", "advanceMeasurement", "<init>", "(II)V", "getVariantGlyph", "()I", "getAdvanceMeasurement", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
    public static final class MathGlyphVariantRecord {
        private final int advanceMeasurement;
        private final int variantGlyph;

        public MathGlyphVariantRecord(int i, int i2) {
            this.variantGlyph = i;
            this.advanceMeasurement = i2;
        }

        public final int getAdvanceMeasurement() {
            return this.advanceMeasurement;
        }

        public final int getVariantGlyph() {
            return this.variantGlyph;
        }
    }

    public MTFreeTypeMathTable(long j, ByteBuffer byteBuffer) throws Exception {
        byteBuffer.getClass();
        this.pointer = j;
        this.data = byteBuffer;
        this.constants = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        this.italicscorrectioninfo = map;
        HashMap<Integer, Integer> map2 = new HashMap<>();
        this.topaccentattachment = map2;
        this.vertglyphconstruction = new HashMap<>();
        this.horizglyphconstruction = new HashMap<>();
        byteBuffer.remaining();
        if (FreeType.FT_Load_Math_Table(j, byteBuffer, byteBuffer.remaining()) && byteBuffer.getInt() == 65536) {
            int dataSInt = getDataSInt();
            int dataSInt2 = getDataSInt();
            int dataSInt3 = getDataSInt();
            readConstants(dataSInt);
            byteBuffer.position(dataSInt2);
            int dataSInt4 = getDataSInt();
            int dataSInt5 = getDataSInt();
            readmatchedtable(dataSInt4 + dataSInt2, map);
            readmatchedtable(dataSInt2 + dataSInt5, map2);
            readvariants(dataSInt3);
        }
    }

    private final int getDataRecord() {
        int dataSInt = getDataSInt();
        getDataSInt();
        return dataSInt;
    }

    private final int getDataSInt() {
        return this.data.getShort();
    }

    private final List<Integer> getVariantsForGlyph(HashMap<Integer, MathGlyphConstruction> construction, int gid) {
        MathGlyphConstruction mathGlyphConstruction = construction.get(Integer.valueOf(gid));
        if (mathGlyphConstruction == null || mathGlyphConstruction.getVariants().length == 0) {
            return x44.W(Integer.valueOf(gid));
        }
        ArrayList arrayList = new ArrayList();
        for (MathGlyphVariantRecord mathGlyphVariantRecord : mathGlyphConstruction.getVariants()) {
            arrayList.add(Integer.valueOf(mathGlyphVariantRecord.getVariantGlyph()));
        }
        return arrayList;
    }

    private final void readConstants(int foffset) {
        this.data.position(foffset);
        for (int i = 0; i < MTFreeTypeMathTableKt.constTable.length; i += 2) {
            String str = MTFreeTypeMathTableKt.constTable[i];
            String str2 = MTFreeTypeMathTableKt.constTable[i + 1];
            if (x44.r(str, "uint16") || x44.r(str, "int16")) {
                this.constants.put(str2, Integer.valueOf(getDataSInt()));
            } else {
                int dataSInt = getDataSInt();
                getDataSInt();
                this.constants.put(str2, Integer.valueOf(dataSInt));
            }
        }
    }

    private final Integer[] readCoverageTable(int foffset) throws Exception {
        Integer[] numArr;
        int iPosition = this.data.position();
        this.data.position(foffset);
        int dataSInt = getDataSInt();
        if (dataSInt == 1) {
            int dataSInt2 = getDataSInt();
            Integer[] numArr2 = new Integer[dataSInt2];
            for (int i = 0; i < dataSInt2; i++) {
                numArr2[i] = 0;
            }
            for (int i2 = 0; i2 < dataSInt2; i2++) {
                numArr2[i2] = Integer.valueOf(getDataSInt());
            }
            numArr = numArr2;
        } else {
            if (dataSInt != 2) {
                throw new Exception("Invalid coverage format");
            }
            int dataSInt3 = getDataSInt();
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < dataSInt3; i3++) {
                int dataSInt4 = getDataSInt();
                int dataSInt5 = getDataSInt();
                int dataSInt6 = getDataSInt();
                if (dataSInt4 <= dataSInt5) {
                    while (true) {
                        int i4 = dataSInt6 + 1;
                        arrayList.add(dataSInt6, Integer.valueOf(dataSInt4));
                        if (dataSInt4 != dataSInt5) {
                            dataSInt4++;
                            dataSInt6 = i4;
                        }
                    }
                }
            }
            numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        }
        this.data.position(iPosition);
        return numArr;
    }

    private final GlyphAssembly readassembly(int foffset) {
        int iPosition = this.data.position();
        this.data.position(foffset);
        int dataRecord = getDataRecord();
        int dataSInt = getDataSInt();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dataSInt; i++) {
            arrayList.add(i, new GlyphPartRecord(getDataSInt(), getDataSInt(), getDataSInt(), getDataSInt(), getDataSInt()));
        }
        GlyphAssembly glyphAssembly = new GlyphAssembly(dataRecord, (GlyphPartRecord[]) arrayList.toArray(new GlyphPartRecord[0]));
        this.data.position(iPosition);
        return glyphAssembly;
    }

    private final MathGlyphConstruction readconstruction(int foffset) {
        int iPosition = this.data.position();
        this.data.position(foffset);
        int dataSInt = getDataSInt();
        int dataSInt2 = getDataSInt();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dataSInt2; i++) {
            arrayList.add(i, new MathGlyphVariantRecord(getDataSInt(), getDataSInt()));
        }
        MathGlyphConstruction mathGlyphConstruction = new MathGlyphConstruction(dataSInt == 0 ? null : readassembly(foffset + dataSInt), (MathGlyphVariantRecord[]) arrayList.toArray(new MathGlyphVariantRecord[0]));
        this.data.position(iPosition);
        return mathGlyphConstruction;
    }

    private final void readmatchedtable(int foffset, HashMap<Integer, Integer> table) throws Exception {
        this.data.position(foffset);
        Integer[] coverageTable = readCoverageTable(foffset + getDataSInt());
        int dataSInt = getDataSInt();
        for (int i = 0; i < dataSInt; i++) {
            table.put(coverageTable[i], Integer.valueOf(getDataRecord()));
        }
    }

    private final void readvariants(int foffset) throws Exception {
        this.data.position(foffset);
        this.minConnectorOverlap = getDataSInt();
        int dataSInt = getDataSInt();
        int dataSInt2 = getDataSInt();
        int dataSInt3 = getDataSInt();
        int dataSInt4 = getDataSInt();
        Integer[] coverageTable = readCoverageTable(dataSInt + foffset);
        Integer[] coverageTable2 = readCoverageTable(dataSInt2 + foffset);
        for (int i = 0; i < dataSInt3; i++) {
            this.vertglyphconstruction.put(coverageTable[i], readconstruction(getDataSInt() + foffset));
        }
        for (int i2 = 0; i2 < dataSInt4; i2++) {
            this.horizglyphconstruction.put(coverageTable2[i2], readconstruction(getDataSInt() + foffset));
        }
    }

    public final int getConstant(String name) {
        name.getClass();
        Integer num = this.constants.get(name);
        num.getClass();
        return num.intValue();
    }

    public final ByteBuffer getData() {
        return this.data;
    }

    public final List<Integer> getHorizontalVariantsForGlyph(int gid) {
        return getVariantsForGlyph(this.horizglyphconstruction, gid);
    }

    public final int getMinConnectorOverlap() {
        return this.minConnectorOverlap;
    }

    public final long getPointer() {
        return this.pointer;
    }

    public final GlyphPartRecord[] getVerticalGlyphAssemblyForGlyph(int gid) {
        MathGlyphConstruction mathGlyphConstruction = this.vertglyphconstruction.get(Integer.valueOf(gid));
        if ((mathGlyphConstruction != null ? mathGlyphConstruction.getAssembly() : null) == null) {
            return null;
        }
        return mathGlyphConstruction.getAssembly().getPartRecords();
    }

    public final List<Integer> getVerticalVariantsForGlyph(int gid) {
        return getVariantsForGlyph(this.vertglyphconstruction, gid);
    }

    public final int getitalicCorrection(int gid) {
        if (this.italicscorrectioninfo.get(Integer.valueOf(gid)) == null) {
            return 0;
        }
        Integer num = this.italicscorrectioninfo.get(Integer.valueOf(gid));
        num.getClass();
        return num.intValue();
    }

    public final Integer gettopAccentAttachment(int gid) {
        return this.topaccentattachment.get(Integer.valueOf(gid));
    }

    public final void setMinConnectorOverlap(int i) {
        this.minConnectorOverlap = i;
    }
}
