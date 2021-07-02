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
public final class HeavyMultibindingModule_ProvideObject114Factory implements Factory<Object> {
  private final HeavyMultibindingModule module;

  public HeavyMultibindingModule_ProvideObject114Factory(HeavyMultibindingModule module) {
    this.module = module;
  }

  @Override
  public Object get() {
    return provideObject114(module);
  }

  public static HeavyMultibindingModule_ProvideObject114Factory create(
      HeavyMultibindingModule module) {
    return new HeavyMultibindingModule_ProvideObject114Factory(module);
  }

  public static Object provideObject114(HeavyMultibindingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideObject114());
  }
}
