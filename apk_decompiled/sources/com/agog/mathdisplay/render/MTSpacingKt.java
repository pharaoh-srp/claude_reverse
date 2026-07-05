package com.agog.mathdisplay.render;

import com.agog.mathdisplay.MathDisplayLogger;
import com.agog.mathdisplay.parse.MTMathAtomType;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\"\u001f\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"interElementSpaceArray", "", "Lcom/agog/mathdisplay/render/MTInterElementSpaceType;", "getInterElementSpaceArray", "()[[Lcom/agog/mathdisplay/render/MTInterElementSpaceType;", "[[Lcom/agog/mathdisplay/render/MTInterElementSpaceType;", "getInterElementSpaceArrayIndexForType", "", "type", "Lcom/agog/mathdisplay/parse/MTMathAtomType;", "row", "", "mathdisplaylib"}, k = 2, mv = {2, 2, 0}, xi = mdj.f)
public final class MTSpacingKt {
    private static final MTInterElementSpaceType[][] interElementSpaceArray;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = mdj.f)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MTMathAtomType.values().length];
            try {
                iArr[MTMathAtomType.KMTMathAtomColor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomColorbox.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomTextColor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomOrdinary.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomPlaceholder.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomLargeOperator.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomBinaryOperator.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomRelation.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomOpen.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomClose.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomPunctuation.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomFraction.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomInner.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MTMathAtomType.KMTMathAtomRadical.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MTInterElementSpaceType mTInterElementSpaceType = MTInterElementSpaceType.KMTSpaceNone;
        MTInterElementSpaceType mTInterElementSpaceType2 = MTInterElementSpaceType.KMTSpaceThin;
        MTInterElementSpaceType mTInterElementSpaceType3 = MTInterElementSpaceType.KMTSpaceNSMedium;
        MTInterElementSpaceType mTInterElementSpaceType4 = MTInterElementSpaceType.KMTSpaceNSThick;
        MTInterElementSpaceType mTInterElementSpaceType5 = MTInterElementSpaceType.KMTSpaceNSThin;
        MTInterElementSpaceType[] mTInterElementSpaceTypeArr = {mTInterElementSpaceType, mTInterElementSpaceType2, mTInterElementSpaceType3, mTInterElementSpaceType4, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType5};
        MTInterElementSpaceType mTInterElementSpaceType6 = MTInterElementSpaceType.KMTSpaceInvalid;
        interElementSpaceArray = new MTInterElementSpaceType[][]{mTInterElementSpaceTypeArr, new MTInterElementSpaceType[]{mTInterElementSpaceType2, mTInterElementSpaceType2, mTInterElementSpaceType6, mTInterElementSpaceType4, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType5}, new MTInterElementSpaceType[]{mTInterElementSpaceType3, mTInterElementSpaceType3, mTInterElementSpaceType6, mTInterElementSpaceType6, mTInterElementSpaceType3, mTInterElementSpaceType6, mTInterElementSpaceType6, mTInterElementSpaceType3}, new MTInterElementSpaceType[]{mTInterElementSpaceType4, mTInterElementSpaceType4, mTInterElementSpaceType6, mTInterElementSpaceType, mTInterElementSpaceType4, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType4}, new MTInterElementSpaceType[]{mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType6, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType}, new MTInterElementSpaceType[]{mTInterElementSpaceType, mTInterElementSpaceType2, mTInterElementSpaceType3, mTInterElementSpaceType4, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType5}, new MTInterElementSpaceType[]{mTInterElementSpaceType5, mTInterElementSpaceType5, mTInterElementSpaceType6, mTInterElementSpaceType5, mTInterElementSpaceType5, mTInterElementSpaceType5, mTInterElementSpaceType5, mTInterElementSpaceType5}, new MTInterElementSpaceType[]{mTInterElementSpaceType5, mTInterElementSpaceType2, mTInterElementSpaceType3, mTInterElementSpaceType4, mTInterElementSpaceType5, mTInterElementSpaceType, mTInterElementSpaceType5, mTInterElementSpaceType5}, new MTInterElementSpaceType[]{mTInterElementSpaceType3, mTInterElementSpaceType5, mTInterElementSpaceType3, mTInterElementSpaceType4, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType, mTInterElementSpaceType5}};
    }

    public static final MTInterElementSpaceType[][] getInterElementSpaceArray() {
        return interElementSpaceArray;
    }

    public static final int getInterElementSpaceArrayIndexForType(MTMathAtomType mTMathAtomType, boolean z) {
        mTMathAtomType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[mTMathAtomType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
            case 13:
                break;
            case 14:
                if (!z) {
                    MathDisplayLogger.INSTANCE.warn$mathdisplaylib("Radical used as right element, treating as ordinary");
                    break;
                }
                break;
            default:
                MathDisplayLogger.INSTANCE.warn$mathdisplaylib("Unknown atom type " + mTMathAtomType + " in spacing lookup, treating as ordinary");
                break;
        }
        return 0;
    }
}
