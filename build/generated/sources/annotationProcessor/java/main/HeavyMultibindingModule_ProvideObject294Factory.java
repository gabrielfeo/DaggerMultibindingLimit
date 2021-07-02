import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HeavyMultibindingModule_ProvideObject294Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject294Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject294(module);
  }

  public static HeavyMultibindingModule_ProvideObject294Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject294Factory(module);
  }

  public static Object provideObject294(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject294());
  }
}
