package com.agog.mathdisplay.render;

import com.agog.mathdisplay.parse.MathDisplayException;
import com.pvporbit.freetype.Face;
import com.pvporbit.freetype.FreeType;
import com.pvporbit.freetype.GlyphMetrics;
import com.pvporbit.freetype.GlyphSlot;
import com.pvporbit.freetype.Library;
import com.pvporbit.freetype.MTFreeTypeMathTable;
import defpackage.f2;
import defpackage.mdj;
import defpackage.mp0;
import defpackage.wd6;
import defpackage.x44;
import defpackage.zni;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u007f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010 \u001a\u00020\u001f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&J5\u0010(\u001a\u00020\"2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u0011¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u0011¢\u0006\u0004\b2\u00100J\u001b\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001b\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u00104\u001a\u000203¢\u0006\u0004\b7\u00106J\u0015\u00108\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f¢\u0006\u0004\b8\u0010\u0019J\u0015\u00109\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000f¢\u0006\u0004\b;\u0010:J\u001d\u0010=\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\u001a2\u0006\u00104\u001a\u00020\u000f¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000fH\u0002¢\u0006\u0004\bA\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010C\u001a\u0004\bD\u0010ER$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Q\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010-\"\u0004\bT\u0010UR\"\u0010V\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010\n\"\u0004\bY\u0010ZR\"\u0010\\\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0011\u0010c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bb\u0010-R\u0011\u0010e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bd\u0010-R\u0011\u0010g\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bf\u0010-R\u0011\u0010i\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bh\u0010-R\u0011\u0010k\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bj\u0010-R\u0011\u0010m\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bl\u0010-R\u0011\u0010o\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bn\u0010-R\u0011\u0010q\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bp\u0010-R\u0011\u0010s\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\br\u0010-R\u0011\u0010u\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bt\u0010-R\u0011\u0010w\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bv\u0010-R\u0011\u0010y\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bx\u0010-R\u0011\u0010{\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bz\u0010-R\u0011\u0010}\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b|\u0010-R\u0011\u0010\u007f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b~\u0010-R\u0013\u0010\u0081\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010-R\u0013\u0010\u0083\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010-R\u0013\u0010\u0085\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010-R\u0013\u0010\u0087\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010-R\u0013\u0010\u0089\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010-R\u0013\u0010\u008b\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010-R\u0013\u0010\u008d\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010-R\u0013\u0010\u008f\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010-R\u0013\u0010\u0091\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010-R\u0013\u0010\u0093\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010-R\u0013\u0010\u0095\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010-R\u0013\u0010\u0097\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010-R\u0013\u0010\u0099\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010-R\u0013\u0010\u009b\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010-R\u0013\u0010\u009d\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010-R\u0013\u0010\u009f\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010-R\u0013\u0010¡\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010-R\u0013\u0010£\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010-R\u0013\u0010¥\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010-R\u0013\u0010§\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010-R\u0013\u0010©\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010-R\u0013\u0010«\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bª\u0001\u0010-R\u0013\u0010\u00ad\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010-R\u0013\u0010¯\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b®\u0001\u0010-R\u0013\u0010±\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b°\u0001\u0010-R\u0013\u0010³\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b²\u0001\u0010-R\u0013\u0010µ\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b´\u0001\u0010-R\u0013\u0010·\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010-R\u0013\u0010¹\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010-R\u0013\u0010»\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010-R\u0013\u0010½\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010-R\u0013\u0010¿\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010-R\u0013\u0010Á\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010-R\u0013\u0010Ã\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010-R\u0013\u0010Å\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010-R\u0013\u0010Ç\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010-R\u0013\u0010É\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010-R\u0013\u0010Ë\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010-R\u0013\u0010Í\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010-R\u0013\u0010Ï\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010-R\u0013\u0010Ñ\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010-R\u0013\u0010Ó\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010-R\u0013\u0010Õ\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010-R\u0013\u0010×\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010-R\u0013\u0010Ù\u0001\u001a\u00020\u000b8F¢\u0006\u0007\u001a\u0005\bØ\u0001\u0010-¨\u0006Ú\u0001"}, d2 = {"Lcom/agog/mathdisplay/render/MTFontMathTable;", "", "Lcom/agog/mathdisplay/render/MTFont;", "font", "Ljava/io/InputStream;", "istreamotf", "<init>", "(Lcom/agog/mathdisplay/render/MTFont;Ljava/io/InputStream;)V", "Lcom/pvporbit/freetype/Face;", "checkFontSize", "()Lcom/pvporbit/freetype/Face;", "", "size", "copyFontTableWithSize", "(F)Lcom/agog/mathdisplay/render/MTFontMathTable;", "", "gid", "", "getGlyphName", "(I)Ljava/lang/String;", "glyphName", "getGlyphWithName", "(Ljava/lang/String;)I", "codepoint", "getGlyphForCodepoint", "(I)I", "", "glyphs", "", "advances", "count", "Liei;", "getAdvancesForGlyphs", "(Ljava/util/List;[Ljava/lang/Float;I)V", "Lcom/agog/mathdisplay/render/BoundingBox;", "u", "b", "unionBounds", "(Lcom/agog/mathdisplay/render/BoundingBox;Lcom/agog/mathdisplay/render/BoundingBox;)V", "boundingRects", "getBoundingRectsForGlyphs", "(Ljava/util/List;[Lcom/agog/mathdisplay/render/BoundingBox;I)Lcom/agog/mathdisplay/render/BoundingBox;", "fontUnitsBox", "(Lcom/agog/mathdisplay/render/BoundingBox;)Lcom/agog/mathdisplay/render/BoundingBox;", "muUnit", "()F", "constName", "constantFromTable", "(Ljava/lang/String;)F", "percentName", "percentFromTable", "Lcom/agog/mathdisplay/render/CGGlyph;", "glyph", "getVerticalVariantsForGlyph", "(Lcom/agog/mathdisplay/render/CGGlyph;)Ljava/util/List;", "getHorizontalVariantsForGlyph", "getLargerGlyph", "getItalicCorrection", "(I)F", "getTopAccentAdjustment", "Lcom/agog/mathdisplay/render/MTGlyphPart;", "getVerticalGlyphAssemblyForGlyph", "(I)Ljava/util/List;", "", "fontUnits", "fontUnitsToPt", "(J)F", "Lcom/agog/mathdisplay/render/MTFont;", "getFont", "()Lcom/agog/mathdisplay/render/MTFont;", "Ljava/io/InputStream;", "getIstreamotf", "()Ljava/io/InputStream;", "setIstreamotf", "(Ljava/io/InputStream;)V", "unitsPerEm", "I", "getUnitsPerEm", "()I", "setUnitsPerEm", "(I)V", "fontSize", "F", "getFontSize", "setFontSize", "(F)V", "freeface", "Lcom/pvporbit/freetype/Face;", "getFreeface", "setFreeface", "(Lcom/pvporbit/freetype/Face;)V", "Lcom/pvporbit/freetype/MTFreeTypeMathTable;", "freeTypeMathTable", "Lcom/pvporbit/freetype/MTFreeTypeMathTable;", "getFreeTypeMathTable", "()Lcom/pvporbit/freetype/MTFreeTypeMathTable;", "setFreeTypeMathTable", "(Lcom/pvporbit/freetype/MTFreeTypeMathTable;)V", "getFractionNumeratorDisplayStyleShiftUp", "fractionNumeratorDisplayStyleShiftUp", "getFractionNumeratorShiftUp", "fractionNumeratorShiftUp", "getFractionDenominatorDisplayStyleShiftDown", "fractionDenominatorDisplayStyleShiftDown", "getFractionDenominatorShiftDown", "fractionDenominatorShiftDown", "getFractionNumeratorDisplayStyleGapMin", "fractionNumeratorDisplayStyleGapMin", "getFractionNumeratorGapMin", "fractionNumeratorGapMin", "getFractionDenominatorDisplayStyleGapMin", "fractionDenominatorDisplayStyleGapMin", "getFractionDenominatorGapMin", "fractionDenominatorGapMin", "getFractionRuleThickness", "fractionRuleThickness", "getSkewedFractionHorizontalGap", "skewedFractionHorizontalGap", "getSkewedFractionVerticalGap", "skewedFractionVerticalGap", "getFractionDelimiterSize", "fractionDelimiterSize", "getFractionDelimiterDisplayStyleSize", "fractionDelimiterDisplayStyleSize", "getSuperscriptShiftUp", "superscriptShiftUp", "getSuperscriptShiftUpCramped", "superscriptShiftUpCramped", "getSubscriptShiftDown", "subscriptShiftDown", "getSuperscriptBaselineDropMax", "superscriptBaselineDropMax", "getSubscriptBaselineDropMin", "subscriptBaselineDropMin", "getSuperscriptBottomMin", "superscriptBottomMin", "getSubscriptTopMax", "subscriptTopMax", "getSubSuperscriptGapMin", "subSuperscriptGapMin", "getSuperscriptBottomMaxWithSubscript", "superscriptBottomMaxWithSubscript", "getSpaceAfterScript", "spaceAfterScript", "getRadicalRuleThickness", "radicalRuleThickness", "getRadicalExtraAscender", "radicalExtraAscender", "getRadicalVerticalGap", "radicalVerticalGap", "getRadicalDisplayStyleVerticalGap", "radicalDisplayStyleVerticalGap", "getRadicalKernBeforeDegree", "radicalKernBeforeDegree", "getRadicalKernAfterDegree", "radicalKernAfterDegree", "getRadicalDegreeBottomRaisePercent", "radicalDegreeBottomRaisePercent", "getUpperLimitGapMin", "upperLimitGapMin", "getUpperLimitBaselineRiseMin", "upperLimitBaselineRiseMin", "getLowerLimitGapMin", "lowerLimitGapMin", "getLowerLimitBaselineDropMin", "lowerLimitBaselineDropMin", "getLimitExtraAscenderDescender", "limitExtraAscenderDescender", "getAxisHeight", "axisHeight", "getScriptScaleDown", "scriptScaleDown", "getScriptScriptScaleDown", "scriptScriptScaleDown", "getMathLeading", "mathLeading", "getDelimitedSubFormulaMinHeight", "delimitedSubFormulaMinHeight", "getAccentBaseHeight", "accentBaseHeight", "getFlattenedAccentBaseHeight", "flattenedAccentBaseHeight", "getDisplayOperatorMinHeight", "displayOperatorMinHeight", "getOverbarExtraAscender", "overbarExtraAscender", "getOverbarRuleThickness", "overbarRuleThickness", "getOverbarVerticalGap", "overbarVerticalGap", "getUnderbarExtraDescender", "underbarExtraDescender", "getUnderbarRuleThickness", "underbarRuleThickness", "getUnderbarVerticalGap", "underbarVerticalGap", "getStackBottomDisplayStyleShiftDown", "stackBottomDisplayStyleShiftDown", "getStackBottomShiftDown", "stackBottomShiftDown", "getStackDisplayStyleGapMin", "stackDisplayStyleGapMin", "getStackGapMin", "stackGapMin", "getStackTopDisplayStyleShiftUp", "stackTopDisplayStyleShiftUp", "getStackTopShiftUp", "stackTopShiftUp", "getStretchStackBottomShiftDown", "stretchStackBottomShiftDown", "getStretchStackGapAboveMin", "stretchStackGapAboveMin", "getStretchStackGapBelowMin", "stretchStackGapBelowMin", "getStretchStackTopShiftUp", "stretchStackTopShiftUp", "getMinConnectorOverlap", "minConnectorOverlap", "mathdisplaylib"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final class MTFontMathTable {
    private final MTFont font;
    private float fontSize;
    public MTFreeTypeMathTable freeTypeMathTable;
    public Face freeface;
    private InputStream istreamotf;
    private int unitsPerEm;

    public MTFontMathTable(MTFont mTFont, InputStream inputStream) throws MathDisplayException {
        byte[] bArrS;
        mTFont.getClass();
        this.font = mTFont;
        this.istreamotf = inputStream;
        this.unitsPerEm = 1;
        this.fontSize = mTFont.getFontSize();
        InputStream inputStream2 = this.istreamotf;
        if (inputStream2 != null) {
            try {
                try {
                    try {
                        inputStream2.getClass();
                        bArrS = zni.S(inputStream2);
                        try {
                            inputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        bArrS = null;
                    }
                    wd6.Z(inputStream2, null);
                    Library libraryNewLibrary = FreeType.newLibrary();
                    if (libraryNewLibrary == null) {
                        throw new MathDisplayException("Error initializing FreeType.");
                    }
                    Face faceNewFace = libraryNewLibrary.newFace(bArrS, 0);
                    faceNewFace.getClass();
                    setFreeface(faceNewFace);
                    checkFontSize();
                    this.unitsPerEm = getFreeface().getUnitsPerEM();
                    MTFreeTypeMathTable mTFreeTypeMathTableLoadMathTable = getFreeface().loadMathTable();
                    mTFreeTypeMathTableLoadMathTable.getClass();
                    setFreeTypeMathTable(mTFreeTypeMathTableLoadMathTable);
                } finally {
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    wd6.Z(inputStream2, th);
                    throw th2;
                }
            }
        }
    }

    private final float fontUnitsToPt(long fontUnits) {
        return (fontUnits * this.fontSize) / this.unitsPerEm;
    }

    public final Face checkFontSize() {
        getFreeface().setCharSize(0, (int) (this.fontSize * 64.0f), 0, 0);
        return getFreeface();
    }

    public final float constantFromTable(String constName) {
        constName.getClass();
        return fontUnitsToPt(getFreeTypeMathTable().getConstant(constName));
    }

    public final MTFontMathTable copyFontTableWithSize(float size) {
        MTFontMathTable mTFontMathTable = new MTFontMathTable(this.font, null);
        mTFontMathTable.fontSize = size;
        mTFontMathTable.unitsPerEm = this.unitsPerEm;
        mTFontMathTable.setFreeface(getFreeface());
        mTFontMathTable.setFreeTypeMathTable(getFreeTypeMathTable());
        return mTFontMathTable;
    }

    public final BoundingBox fontUnitsBox(BoundingBox b) {
        b.getClass();
        BoundingBox boundingBox = new BoundingBox();
        boundingBox.setLowerLeftX(fontUnitsToPt((int) b.getLowerLeftX()));
        boundingBox.setLowerLeftY(fontUnitsToPt((int) b.getLowerLeftY()));
        boundingBox.setUpperRightX(fontUnitsToPt((int) b.getUpperRightX()));
        boundingBox.setUpperRightY(fontUnitsToPt((int) b.getUpperRightY()));
        return boundingBox;
    }

    public final float getAccentBaseHeight() {
        return constantFromTable("AccentBaseHeight");
    }

    public final void getAdvancesForGlyphs(List<Integer> glyphs, Float[] advances, int count) {
        GlyphSlot.Advance advance;
        glyphs.getClass();
        advances.getClass();
        for (int i = 0; i < count; i++) {
            if (!getFreeface().loadGlyph(glyphs.get(i).intValue(), 1) && (advance = getFreeface().getGlyphSlot().getAdvance()) != null) {
                advances[i] = Float.valueOf(fontUnitsToPt(advance.getX()));
            }
        }
    }

    public final float getAxisHeight() {
        return constantFromTable("AxisHeight");
    }

    public final BoundingBox getBoundingRectsForGlyphs(List<Integer> glyphs, BoundingBox[] boundingRects, int count) {
        glyphs.getClass();
        BoundingBox boundingBox = new BoundingBox();
        for (int i = 0; i < count; i++) {
            if (!getFreeface().loadGlyph(glyphs.get(i).intValue(), 1)) {
                BoundingBox boundingBox2 = new BoundingBox();
                GlyphMetrics metrics = getFreeface().getGlyphSlot().getMetrics();
                float fFontUnitsToPt = fontUnitsToPt(metrics.getWidth());
                float fFontUnitsToPt2 = fontUnitsToPt(metrics.getHeight());
                float fFontUnitsToPt3 = fontUnitsToPt(metrics.getHoriBearingX());
                float fFontUnitsToPt4 = fontUnitsToPt(metrics.getHoriBearingY());
                boundingBox2.setLowerLeftX(fFontUnitsToPt3);
                boundingBox2.setLowerLeftY(fFontUnitsToPt4 - fFontUnitsToPt2);
                boundingBox2.setUpperRightX(fFontUnitsToPt3 + fFontUnitsToPt);
                boundingBox2.setUpperRightY(fFontUnitsToPt4);
                unionBounds(boundingBox, boundingBox2);
                if (boundingRects != null) {
                    boundingRects[i] = boundingBox2;
                }
            }
        }
        return boundingBox;
    }

    public final float getDelimitedSubFormulaMinHeight() {
        return constantFromTable("DelimitedSubFormulaMinHeight");
    }

    public final float getDisplayOperatorMinHeight() {
        return constantFromTable("DisplayOperatorMinHeight");
    }

    public final float getFlattenedAccentBaseHeight() {
        return constantFromTable("FlattenedAccentBaseHeight");
    }

    public final MTFont getFont() {
        return this.font;
    }

    public final float getFontSize() {
        return this.fontSize;
    }

    public final float getFractionDelimiterDisplayStyleSize() {
        return this.fontSize * 2.39f;
    }

    public final float getFractionDelimiterSize() {
        return this.fontSize * 1.01f;
    }

    public final float getFractionDenominatorDisplayStyleGapMin() {
        return constantFromTable("FractionDenomDisplayStyleGapMin");
    }

    public final float getFractionDenominatorDisplayStyleShiftDown() {
        return constantFromTable("FractionDenominatorDisplayStyleShiftDown");
    }

    public final float getFractionDenominatorGapMin() {
        return constantFromTable("FractionDenominatorGapMin");
    }

    public final float getFractionDenominatorShiftDown() {
        return constantFromTable("FractionDenominatorShiftDown");
    }

    public final float getFractionNumeratorDisplayStyleGapMin() {
        return constantFromTable("FractionNumDisplayStyleGapMin");
    }

    public final float getFractionNumeratorDisplayStyleShiftUp() {
        return constantFromTable("FractionNumeratorDisplayStyleShiftUp");
    }

    public final float getFractionNumeratorGapMin() {
        return constantFromTable("FractionNumeratorGapMin");
    }

    public final float getFractionNumeratorShiftUp() {
        return constantFromTable("FractionNumeratorShiftUp");
    }

    public final float getFractionRuleThickness() {
        return constantFromTable("FractionRuleThickness");
    }

    public final MTFreeTypeMathTable getFreeTypeMathTable() {
        MTFreeTypeMathTable mTFreeTypeMathTable = this.freeTypeMathTable;
        if (mTFreeTypeMathTable != null) {
            return mTFreeTypeMathTable;
        }
        x44.o0("freeTypeMathTable");
        throw null;
    }

    public final Face getFreeface() {
        Face face = this.freeface;
        if (face != null) {
            return face;
        }
        x44.o0("freeface");
        throw null;
    }

    public final int getGlyphForCodepoint(int codepoint) {
        return getFreeface().getCharIndex(codepoint);
    }

    public final String getGlyphName(int gid) {
        String glyphName = getFreeface().getGlyphName(gid);
        glyphName.getClass();
        return glyphName;
    }

    public final int getGlyphWithName(String glyphName) {
        glyphName.getClass();
        return getFreeface().getGlyphIndexByName(glyphName);
    }

    public final List<Integer> getHorizontalVariantsForGlyph(CGGlyph glyph) {
        glyph.getClass();
        return getFreeTypeMathTable().getHorizontalVariantsForGlyph(glyph.getGid());
    }

    public final InputStream getIstreamotf() {
        return this.istreamotf;
    }

    public final float getItalicCorrection(int gid) {
        return fontUnitsToPt(getFreeTypeMathTable().getitalicCorrection(gid));
    }

    public final int getLargerGlyph(int glyph) {
        String glyphName = this.font.getGlyphName(glyph);
        Iterator<Integer> it = getFreeTypeMathTable().getVerticalVariantsForGlyph(glyph).iterator();
        while (it.hasNext()) {
            String glyphName2 = this.font.getGlyphName(it.next().intValue());
            if (!x44.r(glyphName2, glyphName)) {
                return this.font.getGlyphWithName(glyphName2);
            }
        }
        return glyph;
    }

    public final float getLimitExtraAscenderDescender() {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final float getLowerLimitBaselineDropMin() {
        return constantFromTable("LowerLimitBaselineDropMin");
    }

    public final float getLowerLimitGapMin() {
        return constantFromTable("LowerLimitGapMin");
    }

    public final float getMathLeading() {
        return constantFromTable("MathLeading");
    }

    public final float getMinConnectorOverlap() {
        return fontUnitsToPt(getFreeTypeMathTable().getMinConnectorOverlap());
    }

    public final float getOverbarExtraAscender() {
        return constantFromTable("OverbarExtraAscender");
    }

    public final float getOverbarRuleThickness() {
        return constantFromTable("OverbarRuleThickness");
    }

    public final float getOverbarVerticalGap() {
        return constantFromTable("OverbarVerticalGap");
    }

    public final float getRadicalDegreeBottomRaisePercent() {
        return percentFromTable("RadicalDegreeBottomRaisePercent");
    }

    public final float getRadicalDisplayStyleVerticalGap() {
        return constantFromTable("RadicalDisplayStyleVerticalGap");
    }

    public final float getRadicalExtraAscender() {
        return constantFromTable("RadicalExtraAscender");
    }

    public final float getRadicalKernAfterDegree() {
        return constantFromTable("RadicalKernAfterDegree");
    }

    public final float getRadicalKernBeforeDegree() {
        return constantFromTable("RadicalKernBeforeDegree");
    }

    public final float getRadicalRuleThickness() {
        return constantFromTable("RadicalRuleThickness");
    }

    public final float getRadicalVerticalGap() {
        return constantFromTable("RadicalVerticalGap");
    }

    public final float getScriptScaleDown() {
        return percentFromTable("ScriptPercentScaleDown");
    }

    public final float getScriptScriptScaleDown() {
        return percentFromTable("ScriptScriptPercentScaleDown");
    }

    public final float getSkewedFractionHorizontalGap() {
        return constantFromTable("SkewedFractionHorizontalGap");
    }

    public final float getSkewedFractionVerticalGap() {
        return constantFromTable("SkewedFractionVerticalGap");
    }

    public final float getSpaceAfterScript() {
        return constantFromTable("SpaceAfterScript");
    }

    public final float getStackBottomDisplayStyleShiftDown() {
        return constantFromTable("StackBottomDisplayStyleShiftDown");
    }

    public final float getStackBottomShiftDown() {
        return constantFromTable("StackBottomShiftDown");
    }

    public final float getStackDisplayStyleGapMin() {
        return constantFromTable("StackDisplayStyleGapMin");
    }

    public final float getStackGapMin() {
        return constantFromTable("StackGapMin");
    }

    public final float getStackTopDisplayStyleShiftUp() {
        return constantFromTable("StackTopDisplayStyleShiftUp");
    }

    public final float getStackTopShiftUp() {
        return constantFromTable("StackTopShiftUp");
    }

    public final float getStretchStackBottomShiftDown() {
        return constantFromTable("StretchStackBottomShiftDown");
    }

    public final float getStretchStackGapAboveMin() {
        return constantFromTable("StretchStackGapAboveMin");
    }

    public final float getStretchStackGapBelowMin() {
        return constantFromTable("StretchStackGapBelowMin");
    }

    public final float getStretchStackTopShiftUp() {
        return constantFromTable("StretchStackTopShiftUp");
    }

    public final float getSubSuperscriptGapMin() {
        return constantFromTable("SubSuperscriptGapMin");
    }

    public final float getSubscriptBaselineDropMin() {
        return constantFromTable("SubscriptBaselineDropMin");
    }

    public final float getSubscriptShiftDown() {
        return constantFromTable("SubscriptShiftDown");
    }

    public final float getSubscriptTopMax() {
        return constantFromTable("SubscriptTopMax");
    }

    public final float getSuperscriptBaselineDropMax() {
        return constantFromTable("SuperscriptBaselineDropMax");
    }

    public final float getSuperscriptBottomMaxWithSubscript() {
        return constantFromTable("SuperscriptBottomMaxWithSubscript");
    }

    public final float getSuperscriptBottomMin() {
        return constantFromTable("SuperscriptBottomMin");
    }

    public final float getSuperscriptShiftUp() {
        return constantFromTable("SuperscriptShiftUp");
    }

    public final float getSuperscriptShiftUpCramped() {
        return constantFromTable("SuperscriptShiftUpCramped");
    }

    public final float getTopAccentAdjustment(int glyph) {
        Integer num = getFreeTypeMathTable().gettopAccentAttachment(glyph);
        if (num != null) {
            return fontUnitsToPt(num.intValue());
        }
        Integer[] numArr = {Integer.valueOf(glyph)};
        Float[] fArr = {Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier)};
        getAdvancesForGlyphs(mp0.Y0(numArr), fArr, 1);
        return fArr[0].floatValue() / 2.0f;
    }

    public final float getUnderbarExtraDescender() {
        return constantFromTable("UnderbarExtraDescender");
    }

    public final float getUnderbarRuleThickness() {
        return constantFromTable("UnderbarRuleThickness");
    }

    public final float getUnderbarVerticalGap() {
        return constantFromTable("UnderbarVerticalGap");
    }

    public final int getUnitsPerEm() {
        return this.unitsPerEm;
    }

    public final float getUpperLimitBaselineRiseMin() {
        return constantFromTable("UpperLimitBaselineRiseMin");
    }

    public final float getUpperLimitGapMin() {
        return constantFromTable("UpperLimitGapMin");
    }

    public final List<MTGlyphPart> getVerticalGlyphAssemblyForGlyph(int glyph) {
        MTFreeTypeMathTable.GlyphPartRecord[] verticalGlyphAssemblyForGlyph = getFreeTypeMathTable().getVerticalGlyphAssemblyForGlyph(glyph);
        if (verticalGlyphAssemblyForGlyph == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        f2 f2Var = new f2(verticalGlyphAssemblyForGlyph);
        while (f2Var.hasNext()) {
            MTFreeTypeMathTable.GlyphPartRecord glyphPartRecord = (MTFreeTypeMathTable.GlyphPartRecord) f2Var.next();
            MTGlyphPart mTGlyphPart = new MTGlyphPart(0, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, 31, null);
            mTGlyphPart.setFullAdvance(fontUnitsToPt(glyphPartRecord.getFullAdvance()));
            mTGlyphPart.setEndConnectorLength(fontUnitsToPt(glyphPartRecord.getEndConnectorLength()));
            mTGlyphPart.setStartConnectorLength(fontUnitsToPt(glyphPartRecord.getStartConnectorLength()));
            boolean z = true;
            if (glyphPartRecord.getPartFlags() != 1) {
                z = false;
            }
            mTGlyphPart.setExtender(z);
            mTGlyphPart.setGlyph(glyphPartRecord.getGlyph());
            arrayList.add(mTGlyphPart);
        }
        return arrayList;
    }

    public final List<Integer> getVerticalVariantsForGlyph(CGGlyph glyph) {
        glyph.getClass();
        return getFreeTypeMathTable().getVerticalVariantsForGlyph(glyph.getGid());
    }

    public final float muUnit() {
        return this.fontSize / 18.0f;
    }

    public final float percentFromTable(String percentName) {
        percentName.getClass();
        return getFreeTypeMathTable().getConstant(percentName) / 100.0f;
    }

    public final void setFontSize(float f) {
        this.fontSize = f;
    }

    public final void setFreeTypeMathTable(MTFreeTypeMathTable mTFreeTypeMathTable) {
        mTFreeTypeMathTable.getClass();
        this.freeTypeMathTable = mTFreeTypeMathTable;
    }

    public final void setFreeface(Face face) {
        face.getClass();
        this.freeface = face;
    }

    public final void setIstreamotf(InputStream inputStream) {
        this.istreamotf = inputStream;
    }

    public final void setUnitsPerEm(int i) {
        this.unitsPerEm = i;
    }

    public final void unionBounds(BoundingBox u, BoundingBox b) {
        u.getClass();
        b.getClass();
        u.setLowerLeftX(Math.min(u.getLowerLeftX(), b.getLowerLeftX()));
        u.setLowerLeftY(Math.min(u.getLowerLeftY(), b.getLowerLeftY()));
        u.setUpperRightX(Math.max(u.getUpperRightX(), b.getUpperRightX()));
        u.setUpperRightY(Math.max(u.getUpperRightY(), b.getUpperRightY()));
    }

    private final float fontUnitsToPt(int fontUnits) {
        return (fontUnits * this.fontSize) / this.unitsPerEm;
    }
}
